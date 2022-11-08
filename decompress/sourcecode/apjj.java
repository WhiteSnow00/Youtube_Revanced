import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjj extends agzi implements ahax
{
    public static final apjj a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public String d;
    public boolean e;
    public int f;
    
    static {
        agzi.registerDefaultInstance(apjj.class, a = new apjj());
    }
    
    private apjj() {
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = apjj.g) == null) {
                    synchronized (apjj.class) {
                        if (apjj.g == null) {
                            apjj.g = (ahbe)new agzb((agzi)apjj.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apjj.a;
            }
            case 4: {
                return new agza((agzi)apjj.a);
            }
            case 3: {
                return new apjj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apjj.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001\u0004\u1007\u0003\u0006\u100c\u0005", new Object[] { "b", "c", apje.a(), "d", "e", "f", apjd.f });
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
