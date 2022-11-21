import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apql extends ahcz implements aheo
{
    public static final apql a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(apql.class, a = new apql());
    }
    
    private apql() {
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
                if ((d = apql.d) == null) {
                    synchronized (apql.class) {
                        if (apql.d == null) {
                            apql.d = (ahev)new ahcs((ahcz)apql.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apql.a;
            }
            case 4: {
                return new ahcr((ahcz)apql.a);
            }
            case 3: {
                return new apql();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)apql.a, "\u0001\u0001\u0001\u0000\ufb9c\u2dd7\ufb9c\u2dd7\u0001\u0000\u0000\u0001\ufb9c\u2dd7\u143c\u0000", new Object[] { "c", "b", amtq.class });
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
