import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajmv extends ahcz implements aheo
{
    public static final ajmv a;
    private static volatile ahev i;
    public int b;
    public int c;
    public int d;
    public float e;
    public int f;
    public int g;
    public boolean h;
    private int j;
    
    static {
        ahcz.registerDefaultInstance(ajmv.class, a = new ajmv());
    }
    
    private ajmv() {
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = ajmv.i) == null) {
                    synchronized (ajmv.class) {
                        if (ajmv.i == null) {
                            ajmv.i = (ahev)new ahcs((ahcz)ajmv.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ajmv.a;
            }
            case 4: {
                return new ahcr((ahcz)ajmv.a);
            }
            case 3: {
                return new ajmv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ajmv.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001\u0003\u1004\u0002\u0004\u1001\u0003\u0005\u1004\u0004\u0006\u1004\u0005\u0007\u1007\u0006", new Object[] { "j", "b", "c", "d", "e", "f", "g", "h" });
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
