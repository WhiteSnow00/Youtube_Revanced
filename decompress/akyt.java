import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akyt extends ahcz implements aheo
{
    public static final akyt a;
    private static volatile ahev d;
    public int b;
    public alwr c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(akyt.class, a = new akyt());
    }
    
    private akyt() {
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
                if ((d = akyt.d) == null) {
                    synchronized (akyt.class) {
                        if (akyt.d == null) {
                            akyt.d = (ahev)new ahcs((ahcz)akyt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return akyt.a;
            }
            case 4: {
                return new ahcr((ahcz)akyt.a);
            }
            case 3: {
                return new akyt();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)akyt.a, "\u0001\u0001\u0000\u0001\ufe9b\u33ab\ufe9b\u33ab\u0001\u0000\u0000\u0001\ufe9b\u33ab\u1409\u0000", new Object[] { "b", "c" });
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
