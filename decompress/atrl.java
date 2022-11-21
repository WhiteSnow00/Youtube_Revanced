import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atrl extends ThreadLocal
{
    public final /* bridge */ Object initialValue() {
        return new Random();
    }
}
