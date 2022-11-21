import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apii extends ahcz implements aheo
{
    public static final apii a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apii.class, a = new apii());
    }
    
    private apii() {
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
                if ((d = apii.d) == null) {
                    synchronized (apii.class) {
                        if (apii.d == null) {
                            apii.d = (ahev)new ahcs((ahcz)apii.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apii.a;
            }
            case 4: {
                return new ahcr((ahcz)apii.a);
            }
            case 3: {
                return new apii();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apii.a, "\u0001\u0003\u0001\u0000\ue818\u3884\ufdad\u6124\u0003\u0000\u0000\u0003\ue818\u3884\u143c\u0000\ue38b\u3a4e\u143c\u0000\ufdad\u6124\u143c\u0000", new Object[] { "c", "b", aibi.class, aitl.class, annx.class });
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
