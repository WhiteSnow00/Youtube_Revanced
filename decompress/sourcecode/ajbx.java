import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbx extends agzi implements ahax
{
    private static final ajbx a;
    private static volatile ahbe b;
    
    static {
        agzi.registerDefaultInstance(ajbx.class, a = new ajbx());
    }
    
    private ajbx() {
    }
    
    public static /* synthetic */ ajbx a() {
        return ajbx.a;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ajbx.b) == null) {
                    synchronized (ajbx.class) {
                        if (ajbx.b == null) {
                            ajbx.b = (ahbe)new agzb((agzi)ajbx.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ajbx.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new ajbx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajbx.a, "\u0001\u0000", null);
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