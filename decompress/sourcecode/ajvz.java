import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajvz extends agzi implements ahax
{
    public static final ajvz a;
    public static final agzg b;
    private static volatile ahbe d;
    public String c;
    private int e;
    
    static {
        final ajvz a2 = new ajvz();
        agzi.registerDefaultInstance(ajvz.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, a2, (MessageLite)a2, null, 304505358, ahcm.k, ajvz.class);
    }
    
    private ajvz() {
        this.c = "";
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
                if ((d = ajvz.d) == null) {
                    synchronized (ajvz.class) {
                        if (ajvz.d == null) {
                            ajvz.d = (ahbe)new agzb((agzi)ajvz.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajvz.a;
            }
            case 4: {
                return new agza((agzi)ajvz.a);
            }
            case 3: {
                return new ajvz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajvz.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "e", "c" });
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
