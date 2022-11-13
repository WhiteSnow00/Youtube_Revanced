import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akpg extends ahbh implements ahcw
{
    public static final akpg a;
    private static volatile ahdd g;
    public int b;
    public aklg c;
    public alvj d;
    public String e;
    public int f;
    private byte h;
    
    static {
        ahbh.registerDefaultInstance((Class)akpg.class, (ahbh)(a = new akpg()));
    }
    
    private akpg() {
        this.h = 2;
        this.e = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte h = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd g;
                if ((g = akpg.g) == null) {
                    synchronized (akpg.class) {
                        if (akpg.g == null) {
                            akpg.g = (ahdd)new ahba((ahbh)akpg.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return akpg.a;
            }
            case 4: {
                return new ahaz((ahbh)akpg.a);
            }
            case 3: {
                return new akpg();
            }
            case 2: {
                return newMessageInfo((MessageLite)akpg.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001\u1409\u0000\u0003\u1009\u0001\u0004\u1008\u0002\u0006\u100c\u0004", new Object[] { "b", "c", "d", "e", "f", aibi.j });
            }
            case 1: {
                if (o == null) {
                    h = 0;
                }
                this.h = h;
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
