import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aowq extends agzi implements ahax
{
    private static final aowq a;
    private static volatile ahbe b;
    private String c;
    private String d;
    
    static {
        agzi.registerDefaultInstance(aowq.class, a = new aowq());
    }
    
    private aowq() {
        this.c = "";
        this.d = "";
    }
    
    public static /* synthetic */ aowq a() {
        return aowq.a;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aowq.b) == null) {
                    synchronized (aowq.class) {
                        if (aowq.b == null) {
                            aowq.b = (ahbe)new agzb((agzi)aowq.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aowq.a;
            }
            case 4: {
                return new agza((agzi)a());
            }
            case 3: {
                return new aowq();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aowq.a, "\u0001\u0000", null);
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
