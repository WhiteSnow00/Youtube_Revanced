import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoij extends ahcz implements aheo
{
    public static final aoij a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aoij.class, a = new aoij());
    }
    
    private aoij() {
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
                if ((d = aoij.d) == null) {
                    synchronized (aoij.class) {
                        if (aoij.d == null) {
                            aoij.d = (ahev)new ahcs((ahcz)aoij.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aoij.a;
            }
            case 4: {
                return new ahcr((ahcz)aoij.a);
            }
            case 3: {
                return new aoij();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoij.a, "\u0001\u0001\u0001\u0000\uffc4\u3ccc\uffc4\u3ccc\u0001\u0000\u0000\u0001\uffc4\u3ccc\u143c\u0000", new Object[] { "c", "b", ajab.class });
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
