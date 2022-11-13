import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bkg extends Exception
{
    public bkg(final UUID uuid) {
        super("Media does not support uuid: ".concat(String.valueOf(String.valueOf(uuid))));
    }
}
