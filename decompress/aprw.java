import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aprw extends ahcu implements ahcv
{
    public static final aprw a;
    private static volatile ahev e;
    public int b;
    public String c;
    public int d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(aprw.class, (ahcz)(a = new aprw()));
    }
    
    private aprw() {
        this.f = 2;
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte f = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aprw.e) == null) {
                    synchronized (aprw.class) {
                        if (aprw.e == null) {
                            aprw.e = (ahev)new ahcs((ahcz)aprw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aprw.a;
            }
            case 4: {
                return new ahct((ahcu)aprw.a);
            }
            case 3: {
                return new aprw();
            }
            case 2: {
                return newMessageInfo((MessageLite)aprw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100b\u0001", new Object[] { "b", "c", "d" });
            }
            case 1: {
                if (o == null) {
                    f = 0;
                }
                this.f = f;
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
