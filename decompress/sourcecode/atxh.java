import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxh extends agzi implements ahax
{
    public static final atxh a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public long d;
    public String e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(atxh.class, a = new atxh());
    }
    
    private atxh() {
        this.g = 2;
        this.c = "";
        this.e = "";
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
                final ahbe f;
                if ((f = atxh.f) == null) {
                    synchronized (atxh.class) {
                        if (atxh.f == null) {
                            atxh.f = (ahbe)new agzb((agzi)atxh.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return atxh.a;
            }
            case 4: {
                return new agza((agzi)atxh.a);
            }
            case 3: {
                return new atxh();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atxh.a, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0000\u0000\u0001\u1008\u0000\b\u1005\u0001\t\u1008\u0002", new Object[] { "b", "c", "d", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
