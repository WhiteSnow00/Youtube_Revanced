import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqtw extends ahcz implements aheo
{
    public static final aqtw a;
    private static volatile ahev f;
    public int b;
    public int c;
    public ahej d;
    public long e;
    
    static {
        ahcz.registerDefaultInstance(aqtw.class, a = new aqtw());
    }
    
    private aqtw() {
        this.d = ahej.a;
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
                if ((f = aqtw.f) == null) {
                    synchronized (aqtw.class) {
                        if (aqtw.f == null) {
                            aqtw.f = (ahev)new ahcs((ahcz)aqtw.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqtw.a;
            }
            case 4: {
                return new ahcr((char[])null, (byte[][][])null);
            }
            case 3: {
                return new aqtw();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqtw.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u100c\u0000\u00022\u0003\u1002\u0001", new Object[] { "b", "c", aqtt.a(), "d", aqtv.a, "e" });
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
