import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajfy extends agzi implements ahax
{
    public static final ajfy a;
    public static final agzg b;
    private static volatile ahbe e;
    public int c;
    public int d;
    
    static {
        final ajfy a2 = new ajfy();
        agzi.registerDefaultInstance(ajfy.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)apng.a, a2, (MessageLite)a2, null, 337527695, ahcm.k, ajfy.class);
    }
    
    private ajfy() {
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
                if ((e = ajfy.e) == null) {
                    synchronized (ajfy.class) {
                        if (ajfy.e == null) {
                            ajfy.e = (ahbe)new agzb((agzi)ajfy.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajfy.a;
            }
            case 4: {
                return new agza((agzi)ajfy.a);
            }
            case 3: {
                return new ajfy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajfy.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u100c\u0000", new Object[] { "c", "d", apwq.a() });
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
