import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxg extends agzi implements ahax
{
    public static final atxg a;
    private static volatile ahbe g;
    public int b;
    public long c;
    public int d;
    public agzy e;
    public atxl f;
    private byte h;
    
    static {
        agzi.registerDefaultInstance(atxg.class, a = new atxg());
    }
    
    private atxg() {
        this.h = 2;
        this.e = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe g;
                if ((g = atxg.g) == null) {
                    synchronized (atxg.class) {
                        if (atxg.g == null) {
                            atxg.g = (ahbe)new agzb((agzi)atxg.a);
                        }
                    }
                }
                return g;
            }
            case 5: {
                return atxg.a;
            }
            case 4: {
                return new agza((byte[][])null, (short[])null);
            }
            case 3: {
                return new atxg();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atxg.a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001\u1005\u0000\u0002\u041b\u0003\u100c\u0001\u0006\u1009\u0004", new Object[] { "b", "c", "e", atxh.class, "d", arbt.n, "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.h = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.h;
            }
        }
    }
}
