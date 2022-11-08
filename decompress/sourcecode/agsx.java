import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agsx extends agzi implements ahax
{
    public static final agsx a;
    private static volatile ahbe l;
    public int b;
    public agzy c;
    public String d;
    public String e;
    public agtq f;
    public agty g;
    public agtc h;
    public long i;
    public long j;
    public agtk k;
    
    static {
        agzi.registerDefaultInstance(agsx.class, a = new agsx());
    }
    
    private agsx() {
        this.c = agzi.emptyProtobufList();
        this.d = "";
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe l;
                if ((l = agsx.l) == null) {
                    synchronized (agsx.class) {
                        if (agsx.l == null) {
                            agsx.l = (ahbe)new agzb((agzi)agsx.a);
                        }
                    }
                }
                return l;
            }
            case 5: {
                return agsx.a;
            }
            case 4: {
                return new agza((boolean[])null, (byte[][][])null);
            }
            case 3: {
                return new agsx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agsx.a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001\u001b\u0002\u1008\u0000\u0004\u1009\u0002\u0005\u1009\u0003\u0006\u1008\u0001\u0007\u1009\u0004\t\u1002\u0006\n\u1002\u0007\u000b\u1009\b", new Object[] { "b", "c", agsw.class, "d", "f", "g", "e", "h", "i", "j", "k" });
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
