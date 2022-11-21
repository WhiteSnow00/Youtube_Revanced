import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aquc extends ahcz implements aheo
{
    public static final aquc a;
    private static volatile ahev f;
    public int b;
    public int c;
    public ahej d;
    public ahej e;
    
    static {
        ahcz.registerDefaultInstance(aquc.class, a = new aquc());
    }
    
    private aquc() {
        this.d = ahej.a;
        this.e = ahej.a;
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
                if ((f = aquc.f) == null) {
                    synchronized (aquc.class) {
                        if (aquc.f == null) {
                            aquc.f = (ahev)new ahcs((ahcz)aquc.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aquc.a;
            }
            case 4: {
                return new ahcr((char[][][])null);
            }
            case 3: {
                return new aquc();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aquc.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0002\u0000\u0000\u0001\u1004\u0000\u00022\u00032", new Object[] { "b", "c", "d", aqua.a, "e", aqub.a });
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
