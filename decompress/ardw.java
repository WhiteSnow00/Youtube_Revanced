import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ardw extends ahcz implements aheo
{
    public static final ardw a;
    private static volatile ahev e;
    public int b;
    public String c;
    public aowb d;
    private byte f;
    
    static {
        ahcz.registerDefaultInstance(ardw.class, a = new ardw());
    }
    
    private ardw() {
        this.f = 2;
        this.c = "";
    }
    
    @Override
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
                if ((e = ardw.e) == null) {
                    synchronized (ardw.class) {
                        if (ardw.e == null) {
                            ardw.e = (ahev)new ahcs((ahcz)ardw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ardw.a;
            }
            case 4: {
                return new ahcr((ahcz)ardw.a);
            }
            case 3: {
                return new ardw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ardw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1409\u0001", new Object[] { "b", "c", "d" });
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
