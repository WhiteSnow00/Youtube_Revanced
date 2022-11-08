import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajee extends agzi implements ahax
{
    public static final ajee a;
    private static volatile ahbe i;
    public int b;
    public String c;
    public agzy d;
    public ajdq e;
    public boolean f;
    public int g;
    public String h;
    
    static {
        agzi.registerDefaultInstance(ajee.class, a = new ajee());
    }
    
    private ajee() {
        this.c = "";
        this.d = agzi.emptyProtobufList();
        this.h = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe i;
                if ((i = ajee.i) == null) {
                    synchronized (ajee.class) {
                        if (ajee.i == null) {
                            ajee.i = (ahbe)new agzb((agzi)ajee.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return ajee.a;
            }
            case 4: {
                return new agza((agzi)ajee.a);
            }
            case 3: {
                return new ajee();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajee.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u1009\u0001\u0004\u1007\u0002\u0005\u100c\u0003\u0006\u1008\u0004", new Object[] { "b", "c", "d", ajdq.class, "e", "f", "g", ajef.a(), "h" });
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
