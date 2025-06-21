package me.itsglobally.addon.ffa;

import me.bedtwL.ffa.api.EffectAddon;

public class RickrollKillEffectMain implements EffectAddon {
    @Override
    public String getName() {
        return "Rickrollffect";
    }

    @Override
    public String getAuthor() {
        return "ItsGlobally";
    }

    @Override
    public void onEnable() {
        new RickrollKillEffect().registerKillEffect();
    }

    @Override
    public void onDisable() {
        new RickrollKillEffect().unregisterKillEffect();
    }
}
