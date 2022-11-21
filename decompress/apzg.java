import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apzg extends ahcz implements aheo
{
    public static final apzg a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apzg.class, a = new apzg());
    }
    
    private apzg() {
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
                if ((d = apzg.d) == null) {
                    synchronized (apzg.class) {
                        if (apzg.d == null) {
                            apzg.d = (ahev)new ahcs((ahcz)apzg.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apzg.a;
            }
            case 4: {
                return new ahcr((ahcz)apzg.a);
            }
            case 3: {
                return new apzg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apzg.a, "\u0001\u0001\u0001\u0000\uffbb\u3b11\uffbb\u3b11\u0001\u0000\u0000\u0001\uffbb\u3b11\u143c\u0000", new Object[] { "c", "b", apzh.class });
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
