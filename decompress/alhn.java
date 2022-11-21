import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class alhn extends ahcz implements aheo
{
    public static final alhn a;
    private static volatile ahev d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(alhn.class, a = new alhn());
    }
    
    private alhn() {
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
                if ((d = alhn.d) == null) {
                    synchronized (alhn.class) {
                        if (alhn.d == null) {
                            alhn.d = (ahev)new ahcs((ahcz)alhn.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return alhn.a;
            }
            case 4: {
                return new ahcr((ahcz)alhn.a);
            }
            case 3: {
                return new alhn();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)alhn.a, "\u0001\u0004\u0001\u0000\uf321\u1e90\uf989\u410a\u0004\u0000\u0000\u0004\uf321\u1e90\u143c\u0000\uf437\u1f3b\u143c\u0000\ufb9c\u2dd7\u143c\u0000\uf989\u410a\u143c\u0000", new Object[] { "c", "b", aizd.class, aqal.class, amtq.class, alrw.class });
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
