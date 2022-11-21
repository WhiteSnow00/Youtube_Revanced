import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aque extends ahcz implements aheo
{
    public static final aque a;
    private static volatile ahev f;
    public int b;
    public ahej c;
    public boolean d;
    public long e;
    
    static {
        ahcz.registerDefaultInstance(aque.class, a = new aque());
    }
    
    private aque() {
        this.c = ahej.a;
        this.e = -1L;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aque.f) == null) {
                    synchronized (aque.class) {
                        if (aque.f == null) {
                            aque.f = (ahev)new ahcs((ahcz)aque.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aque.a;
            }
            case 4: {
                return new ahcr((float[][])null, (byte[])null);
            }
            case 3: {
                return new aque();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aque.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u00012\u0002\u1007\u0000\u0003\u1002\u0001", new Object[] { "b", "c", aqud.a, "d", "e" });
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
