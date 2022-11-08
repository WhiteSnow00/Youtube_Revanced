import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amii extends agzi implements ahax
{
    public static final amii a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public long d;
    public boolean e;
    
    static {
        agzi.registerDefaultInstance((Class)amii.class, (agzi)(a = new amii()));
    }
    
    private amii() {
        this.c = "";
        agzi.emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = amii.f) == null) {
                    synchronized (amii.class) {
                        if (amii.f == null) {
                            amii.f = (ahbe)new agzb((agzi)amii.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return amii.a;
            }
            case 4: {
                return new agza((agzi)amii.a);
            }
            case 3: {
                return new amii();
            }
            case 2: {
                return newMessageInfo((MessageLite)amii.a, "\u0001\u0003\u0000\u000114\u0003\u0000\u0000\u00001\u1008\u00003\u1002\u00014\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
