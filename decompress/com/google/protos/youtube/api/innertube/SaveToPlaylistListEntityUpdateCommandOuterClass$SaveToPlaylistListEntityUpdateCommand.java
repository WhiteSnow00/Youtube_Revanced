// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class SaveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand extends agzi implements ahax
{
    public static final SaveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand a;
    private static volatile ahbe e;
    public static final agzg saveToPlaylistListEntityUpdateCommand;
    public String b;
    public String c;
    public int d;
    private int f;
    
    static {
        final SaveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand a2 = new SaveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand();
        agzi.registerDefaultInstance((Class)SaveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand.class, (agzi)(a = a2));
        saveToPlaylistListEntityUpdateCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 455257696, ahcm.k, (Class)SaveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand.class);
    }
    
    private SaveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand() {
        this.b = "";
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = SaveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand.e) == null) {
                    synchronized (SaveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand.class) {
                        if (SaveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand.e == null) {
                            SaveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand.e = (ahbe)new agzb((agzi)SaveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return SaveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand.a;
            }
            case 4: {
                return new agza((agzi)SaveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand.a);
            }
            case 3: {
                return new SaveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)SaveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u100c\u0002", new Object[] { "f", "b", "c", "d", angs.b });
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
