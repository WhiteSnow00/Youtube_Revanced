import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agqw extends agzi implements ahax
{
    public static final agqw a;
    private static volatile ahbe e;
    public int b;
    public agzy c;
    public agqy d;
    
    static {
        agzi.registerDefaultInstance(agqw.class, a = new agqw());
    }
    
    private agqw() {
        this.c = agzi.emptyProtobufList();
    }
    
    public final void a() {
        final agzy c = this.c;
        if (!c.c()) {
            this.c = agzi.mutableCopy(c);
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
                final ahbe e;
                if ((e = agqw.e) == null) {
                    synchronized (agqw.class) {
                        if (agqw.e == null) {
                            agqw.e = (ahbe)new agzb((agzi)agqw.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agqw.a;
            }
            case 4: {
                return new agza((agzi)agqw.a);
            }
            case 3: {
                return new agqw();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agqw.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u1009\u0000", new Object[] { "b", "c", agqu.class, "d" });
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
