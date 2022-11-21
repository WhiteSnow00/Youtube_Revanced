import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alai extends ahcz implements aheo
{
    public static final alai a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(alai.class, a = new alai());
    }
    
    private alai() {
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
                if ((d = alai.d) == null) {
                    synchronized (alai.class) {
                        if (alai.d == null) {
                            alai.d = (ahev)new ahcs((ahcz)alai.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alai.a;
            }
            case 4: {
                return new ahcr((ahcz)alai.a);
            }
            case 3: {
                return new alai();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alai.a, "\u0001\u0004\u0001\u0000\ue7f5\u178e\uf171\u3996\u0004\u0000\u0000\u0004\ue7f5\u178e\u143c\u0000\ueaaa\u1fae\u143c\u0000\ue282\u363f\u143c\u0000\uf171\u3996\u143c\u0000", new Object[] { "c", "b", aobc.class, amiv.class, anxo.class, amnm.class });
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
