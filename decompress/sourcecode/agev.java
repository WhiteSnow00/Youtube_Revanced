import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agev extends agzi implements ahax
{
    public static final agev a;
    private static volatile ahbe f;
    public int b;
    public agyc c;
    public agzy d;
    public boolean e;
    
    static {
        agzi.registerDefaultInstance(agev.class, a = new agev());
    }
    
    private agev() {
        this.c = agyc.b;
        this.d = agzi.emptyProtobufList();
    }
    
    public final void a() {
        final agzy d = this.d;
        if (!d.c()) {
            this.d = agzi.mutableCopy(d);
        }
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = agev.f) == null) {
                    synchronized (agev.class) {
                        if (agev.f == null) {
                            agev.f = (ahbe)new agzb((agzi)agev.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return agev.a;
            }
            case 4: {
                return new agza((agzi)agev.a);
            }
            case 3: {
                return new agev();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agev.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u100a\u0000\u0002\u001c\u0003\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
