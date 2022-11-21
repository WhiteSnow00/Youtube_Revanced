import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amiw extends ahcz implements aheo
{
    public static final amiw a;
    private static volatile ahev d;
    public int b;
    public ahbt c;
    private aisc e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(amiw.class, a = new amiw());
    }
    
    private amiw() {
        this.g = 2;
        this.c = ahbt.b;
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
                final ahev d;
                if ((d = amiw.d) == null) {
                    synchronized (amiw.class) {
                        if (amiw.d == null) {
                            amiw.d = (ahev)new ahcs((ahcz)amiw.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amiw.a;
            }
            case 4: {
                return new ahcr((ahcz)amiw.a);
            }
            case 3: {
                return new amiw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amiw.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u100a\u0002", new Object[] { "b", "e", "f", "c" });
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
