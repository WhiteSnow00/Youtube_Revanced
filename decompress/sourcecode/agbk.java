import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agbk extends agzi implements ahax
{
    public static final agbk a;
    private static volatile ahbe e;
    public String b;
    public agyc c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(agbk.class, a = new agbk());
    }
    
    private agbk() {
        this.b = "";
        this.c = agyc.b;
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
                if ((e = agbk.e) == null) {
                    synchronized (agbk.class) {
                        if (agbk.e == null) {
                            agbk.e = (ahbe)new agzb((agzi)agbk.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agbk.a;
            }
            case 4: {
                return new agza((agzi)agbk.a);
            }
            case 3: {
                return new agbk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agbk.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\f", new Object[] { "b", "c", "d" });
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
