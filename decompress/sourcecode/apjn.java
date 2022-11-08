import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjn extends agzi implements ahax
{
    public static final apjn a;
    private static volatile ahbe g;
    public int b;
    public int c;
    public Object d;
    public int e;
    public boolean f;
    
    static {
        agzi.registerDefaultInstance(apjn.class, a = new apjn());
    }
    
    private apjn() {
        this.c = 0;
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
                if ((g = apjn.g) == null) {
                    synchronized (apjn.class) {
                        if (apjn.g == null) {
                            apjn.g = (ahbe)new agzb((agzi)apjn.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return apjn.a;
            }
            case 4: {
                return new agza((agzi)apjn.a);
            }
            case 3: {
                return new apjn();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apjn.a, "\u0001\t\u0001\u0001\u0001\u000b\t\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u103c\u0000\u0003\u103c\u0000\u0004\u1007\b\u0005\u103c\u0000\u0006\u103c\u0000\t\u103c\u0000\n\u103c\u0000\u000b\u103c\u0000", new Object[] { "d", "c", "b", "e", apjd.g, apjo.class, apjm.class, "f", apjp.class, apjl.class, apji.class, apjk.class, apjt.class });
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
