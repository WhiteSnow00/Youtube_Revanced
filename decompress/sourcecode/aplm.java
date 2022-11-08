import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aplm extends agzi implements ahax
{
    public static final aplm a;
    public static final agzg b;
    private static volatile ahbe g;
    public int c;
    public String d;
    public String e;
    public long f;
    
    static {
        final aplm a2 = new aplm();
        agzi.registerDefaultInstance(aplm.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)ajnz.a, a2, (MessageLite)a2, null, 76, ahcm.k, aplm.class);
    }
    
    private aplm() {
        this.d = "";
        this.e = "";
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
                if ((g = aplm.g) == null) {
                    synchronized (aplm.class) {
                        if (aplm.g == null) {
                            aplm.g = (ahbe)new agzb((agzi)aplm.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return aplm.a;
            }
            case 4: {
                return new agza((agzi)aplm.a);
            }
            case 3: {
                return new aplm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aplm.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1002\u0002", new Object[] { "c", "d", "e", "f" });
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
