import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoqk extends agzi implements ahax
{
    public static final aoqk a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public int d;
    public agzy e;
    
    static {
        agzi.registerDefaultInstance(aoqk.class, a = new aoqk());
    }
    
    private aoqk() {
        this.c = "";
        this.e = agzi.emptyProtobufList();
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
                if ((f = aoqk.f) == null) {
                    synchronized (aoqk.class) {
                        if (aoqk.f == null) {
                            aoqk.f = (ahbe)new agzb((agzi)aoqk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aoqk.a;
            }
            case 4: {
                return new agza((boolean[][][])null, (boolean[])null);
            }
            case 3: {
                return new aoqk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aoqk.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u001b", new Object[] { "b", "c", "d", aonj.m, "e", aoqj.class });
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
