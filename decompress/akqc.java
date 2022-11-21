import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akqc extends ahcz implements aheo
{
    public static final akqc a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akqc.class, a = new akqc());
    }
    
    private akqc() {
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
                if ((d = akqc.d) == null) {
                    synchronized (akqc.class) {
                        if (akqc.d == null) {
                            akqc.d = (ahev)new ahcs((ahcz)akqc.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akqc.a;
            }
            case 4: {
                return new ahcr((ahcz)akqc.a);
            }
            case 3: {
                return new akqc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akqc.a, "\u0001\u0002\u0001\u0000\ufe18\u3299\uf53f\u32b6\u0002\u0000\u0000\u0002\ufe18\u3299\u143c\u0000\uf53f\u32b6\u143c\u0000", new Object[] { "c", "b", akqe.class, akqd.class });
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
