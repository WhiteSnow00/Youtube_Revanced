import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcl extends agzi implements ahax
{
    public static final ajcl a;
    public static final agzg b;
    private static volatile ahbe c;
    
    static {
        final ajcl a2 = new ajcl();
        agzi.registerDefaultInstance(ajcl.class, a = a2);
        b = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, a2, (MessageLite)a2, null, 259738798, ahcm.k, ajcl.class);
    }
    
    private ajcl() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ajcl.c) == null) {
                    synchronized (ajcl.class) {
                        if (ajcl.c == null) {
                            ajcl.c = (ahbe)new agzb((agzi)ajcl.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajcl.a;
            }
            case 4: {
                return new agza((agzi)ajcl.a);
            }
            case 3: {
                return new ajcl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajcl.a, "\u0001\u0000", null);
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
