import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aegg extends agzi implements ahax
{
    public static final aegg a;
    private static volatile ahbe e;
    public agzy b;
    public agzq c;
    public boolean d;
    
    static {
        agzi.registerDefaultInstance(aegg.class, a = new aegg());
    }
    
    private aegg() {
        this.b = agzi.emptyProtobufList();
        this.c = agzi.emptyIntList();
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
                if ((e = aegg.e) == null) {
                    synchronized (aegg.class) {
                        if (aegg.e == null) {
                            aegg.e = (ahbe)new agzb((agzi)aegg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aegg.a;
            }
            case 4: {
                return new agza((agzi)aegg.a);
            }
            case 3: {
                return new aegg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aegg.a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002'\u0003\u0007", new Object[] { "b", aegf.class, "c", "d" });
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
