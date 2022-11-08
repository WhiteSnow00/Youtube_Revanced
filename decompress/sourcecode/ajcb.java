import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajcb extends agzi implements ahax
{
    public static final ajcb a;
    private static volatile ahbe e;
    public int b;
    public agzy c;
    public int d;
    
    static {
        agzi.registerDefaultInstance(ajcb.class, a = new ajcb());
    }
    
    private ajcb() {
        this.c = agzi.emptyProtobufList();
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
                if ((e = ajcb.e) == null) {
                    synchronized (ajcb.class) {
                        if (ajcb.e == null) {
                            ajcb.e = (ahbe)new agzb((agzi)ajcb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return ajcb.a;
            }
            case 4: {
                return new agza((int[][][])null, (byte[][])null);
            }
            case 3: {
                return new ajcb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajcb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u100c\u0000", new Object[] { "b", "c", amci.class, "d", aicj.e });
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
