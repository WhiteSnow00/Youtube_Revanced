import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgf extends agzi implements ahax
{
    public static final ajgf a;
    private static volatile ahbe d;
    public int b;
    public boolean c;
    
    static {
        agzi.registerDefaultInstance(ajgf.class, a = new ajgf());
    }
    
    private ajgf() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ajgf.d) == null) {
                    synchronized (ajgf.class) {
                        if (ajgf.d == null) {
                            ajgf.d = (ahbe)new agzb((agzi)ajgf.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajgf.a;
            }
            case 4: {
                return new agza((agzi)ajgf.a);
            }
            case 3: {
                return new ajgf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajgf.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1007\u0000", new Object[] { "b", "c" });
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