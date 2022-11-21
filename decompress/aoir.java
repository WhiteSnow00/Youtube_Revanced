import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoir extends ahcz implements aheo
{
    public static final aoir a;
    private static volatile ahev d;
    public int b;
    public Object c;
    
    static {
        ahcz.registerDefaultInstance(aoir.class, a = new aoir());
    }
    
    private aoir() {
        this.b = 0;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aoir.d) == null) {
                    synchronized (aoir.class) {
                        if (aoir.d == null) {
                            aoir.d = (ahev)new ahcs((ahcz)aoir.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoir.a;
            }
            case 4: {
                return new ahcr((ahcz)aoir.a);
            }
            case 3: {
                return new aoir();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoir.a, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u103c\u0000", new Object[] { "c", "b", ajrt.class });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
