import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoje extends ahcz implements aheo
{
    public static final aoje a;
    private static volatile ahev f;
    public int b;
    public String c;
    public String d;
    public aisc e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aoje.class, a = new aoje());
    }
    
    private aoje() {
        this.g = 2;
        this.c = "";
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
                if ((f = aoje.f) == null) {
                    synchronized (aoje.class) {
                        if (aoje.f == null) {
                            aoje.f = (ahev)new ahcs((ahcz)aoje.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aoje.a;
            }
            case 4: {
                return new ahcr((ahcz)aoje.a);
            }
            case 3: {
                return new aoje();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoje.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1409\u0002", new Object[] { "b", "c", "d", "e" });
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
