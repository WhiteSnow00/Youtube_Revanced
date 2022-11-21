import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptp extends ahcz implements aheo
{
    public static final aptp a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aptp.class, a = new aptp());
    }
    
    private aptp() {
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
                if ((d = aptp.d) == null) {
                    synchronized (aptp.class) {
                        if (aptp.d == null) {
                            aptp.d = (ahev)new ahcs((ahcz)aptp.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aptp.a;
            }
            case 4: {
                return new ahcr((ahcz)aptp.a);
            }
            case 3: {
                return new aptp();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aptp.a, "\u0001\u0004\u0001\u0000\uf3bf\u17d3\ue0ef\u3f6a\u0004\u0000\u0000\u0004\uf3bf\u17d3\u143c\u0000\ufc6c\u17d3\u143c\u0000\uea0c\u3a83\u143c\u0000\ue0ef\u3f6a\u143c\u0000", new Object[] { "c", "b", aptq.class, apui.class, aptt.class, aomq.class });
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
