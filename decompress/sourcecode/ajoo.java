import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajoo extends agzi implements ahax
{
    public static final ajoo a;
    public static final agzg b;
    private static volatile ahbe d;
    public String c;
    private int e;
    
    static {
        final ajoo a2 = new ajoo();
        agzi.registerDefaultInstance((Class)ajoo.class, (agzi)(a = a2));
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 382489859, ahcm.k, (Class)ajoo.class);
    }
    
    private ajoo() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe d;
                if ((d = ajoo.d) == null) {
                    synchronized (ajoo.class) {
                        if (ajoo.d == null) {
                            ajoo.d = (ahbe)new agzb((agzi)ajoo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return ajoo.a;
            }
            case 4: {
                return new agza((agzi)ajoo.a);
            }
            case 3: {
                return new ajoo();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajoo.a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u1008\u0001", new Object[] { "e", "c" });
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
