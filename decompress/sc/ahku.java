import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahku extends ahbh implements ahcw
{
    public static final ahku a;
    private static volatile ahdd h;
    public int b;
    public apki c;
    public ajuc d;
    public aooo e;
    public apkj f;
    public apkh g;
    private alfw i;
    private ahnr j;
    private byte k;
    
    static {
        ahbh.registerDefaultInstance((Class)ahku.class, (ahbh)(a = new ahku()));
    }
    
    private ahku() {
        this.k = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = ahku.h) == null) {
                    synchronized (ahku.class) {
                        if (ahku.h == null) {
                            ahku.h = (ahdd)new ahba((ahbh)ahku.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ahku.a;
            }
            case 4: {
                return new ahaz((ahbh)ahku.a);
            }
            case 3: {
                return new ahku();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahku.a, "\u0001\u0007\u0000\u0001\ufd61\u1d59\ufcb1\ua32a\u0007\u0000\u0000\u0006\ufd61\u1d59\u1409\u0000\uf95d\u2871\u1009\u0001\uf09c\u28a0\u1409\u0002\ue162\u2a82\u1409\u0004\ue879\u32f6\u1409\u0003\ue4bf\ua2da\u1409\u0005\ufcb1\ua32a\u1409\u0006", new Object[] { "b", "c", "d", "e", "j", "i", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
