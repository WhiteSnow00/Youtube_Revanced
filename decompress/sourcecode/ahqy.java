import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahqy extends agzi implements ahax
{
    public static final ahqy a;
    private static volatile ahbe l;
    public int b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    
    static {
        agzi.registerDefaultInstance(ahqy.class, a = new ahqy());
    }
    
    private ahqy() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe l;
                if ((l = ahqy.l) == null) {
                    synchronized (ahqy.class) {
                        if (ahqy.l == null) {
                            ahqy.l = (ahbe)new agzb((agzi)ahqy.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return ahqy.a;
            }
            case 4: {
                return new agza((agzi)ahqy.a);
            }
            case 3: {
                return new ahqy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ahqy.a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001\u1007\u0000\u0002\u1007\u0001\u0003\u1004\u0002\u0004\u1004\u0003\u0005\u1004\u0004\u0006\u1004\u0005\u0007\u1004\u0006\b\u1007\u0007\n\u1007\b", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", "j", "k" });
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
