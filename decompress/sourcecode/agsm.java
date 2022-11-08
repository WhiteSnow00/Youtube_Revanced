import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsm extends agzi implements ahax
{
    public static final agsm a;
    private static volatile ahbe e;
    public agsi b;
    public int c;
    public ahas d;
    
    static {
        agzi.registerDefaultInstance(agsm.class, a = new agsm());
    }
    
    private agsm() {
        this.d = ahas.a;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = agsm.e) == null) {
                    synchronized (agsm.class) {
                        if (agsm.e == null) {
                            agsm.e = (ahbe)new agzb((agzi)agsm.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agsm.a;
            }
            case 4: {
                return new agza((agzi)agsm.a);
            }
            case 3: {
                return new agsm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agsm.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\t\u0002\f\u00032", new Object[] { "b", "c", "d", agsj.a });
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
