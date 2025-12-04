package com.devdyna.cobbledon.datagen.client;

import static com.devdyna.cobbledon.Main.MODID;

import com.devdyna.cobbledon.init.types.zBlocks;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.DeferredHolder;

@SuppressWarnings({ "null" })
public class DataLang extends LanguageProvider {

    public DataLang(PackOutput o) {
        super(o, MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        zBlocks.zPokeBall.getEntries().forEach(i -> addBlock(i, named(i)));
    }

    private String named(DeferredHolder<?, ?> b) {

        StringBuilder result = new StringBuilder();
        for (String word : b.getRegisteredName().replace(MODID + ":", "").replaceAll("_", " ").split(" ")) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        return result.toString().trim();
    }
}
