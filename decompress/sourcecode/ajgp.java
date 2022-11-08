import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgp extends agzi implements ahax
{
    public static final ajgp a;
    public static final agzg b;
    private static volatile ahbe g;
    public int c;
    public String d;
    public String e;
    public String f;
    
    static {
        final ajgp a2 = new ajgp();
        agzi.registerDefaultInstance(ajgp.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)ajnz.a, a2, (MessageLite)a2, null, 301, ahcm.k, ajgp.class);
    }
    
    private ajgp() {
        this.d = "";
        this.e = "";
        this.f = "";
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
                if ((g = ajgp.g) == null) {
                    synchronized (ajgp.class) {
                        if (ajgp.g == null) {
                            ajgp.g = (ahbe)new agzb((agzi)ajgp.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return ajgp.a;
            }
            case 4: {
                return new agza((agzi)ajgp.a);
            }
            case 3: {
                return new ajgp();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajgp.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "c", "d", "e", "f" });
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
