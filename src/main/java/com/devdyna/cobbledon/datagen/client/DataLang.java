package com.devdyna.cobbledon.datagen.client;

import static com.devdyna.cobbledon.Main.MODID;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.neoforged.neoforge.registries.DeferredHolder;

@SuppressWarnings({ "rawtypes", "null", "unused" })
public class DataLang extends LanguageProvider {

    public DataLang(PackOutput o) {
        super(o, MODID, "en_us");
    }

    @Override
    protected void addTranslations() {
        // RegistryToLang("block",Blocks.BK, "hi");
        // RegistryToLang("item",Items.IT, "hi");
    }

    private void RegistryToLang(String type, DeferredHolder d, String text) {
        add(type + "." + d.getRegisteredName().replace(":", "."), text);
    }

}
