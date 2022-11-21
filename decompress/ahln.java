import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahln extends ahcz implements aheo
{
    public static final ahln a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(ahln.class, a = new ahln());
    }
    
    private ahln() {
        this.b = 0;
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = ahln.d) == null) {
                    synchronized (ahln.class) {
                        if (ahln.d == null) {
                            ahln.d = (ahev)new ahcs((ahcz)ahln.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ahln.a;
            }
            case 4: {
                return new ahcr((ahcz)ahln.a);
            }
            case 3: {
                return new ahln();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ahln.a, "\u0001\u0002\u0001\u0000\ueeec\u1e3f\ued6a\u25bb\u0002\u0000\u0000\u0002\ueeec\u1e3f\u143c\u0000\ued6a\u25bb\u143c\u0000", new Object[] { "c", "b", ahll.class, aixb.class });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
