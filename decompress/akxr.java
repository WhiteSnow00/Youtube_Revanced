import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akxr extends ahcz implements aheo
{
    public static final akxr a;
    private static volatile ahev f;
    public int b;
    public aknh c;
    public String d;
    public long e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(akxr.class, a = new akxr());
    }
    
    private akxr() {
        this.g = 2;
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = akxr.f) == null) {
                    synchronized (akxr.class) {
                        if (akxr.f == null) {
                            akxr.f = (ahev)new ahcs((ahcz)akxr.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akxr.a;
            }
            case 4: {
                return new ahcr((ahcz)akxr.a);
            }
            case 3: {
                return new akxr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akxr.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u1002\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
