// 
// Decompiled by Procyon v0.6.0
// 

package com.google.protos.youtube.api.innertube;

import com.google.protobuf.MessageLite;

public final class ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand extends agzi implements ahax
{
    public static final ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand a;
    private static volatile ahbe b;
    public static final agzg showFullscreenEngagementOverlayCommand;
    
    static {
        final ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand a2 = new ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand();
        agzi.registerDefaultInstance((Class)ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand.class, (agzi)(a = a2));
        showFullscreenEngagementOverlayCommand = agzi.newSingularGeneratedExtension((MessageLite)aioe.a, (Object)a2, (MessageLite)a2, (agzn)null, 392585764, ahcm.k, (Class)ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand.class);
    }
    
    private ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand() {
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand.b) == null) {
                    synchronized (ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand.class) {
                        if (ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand.b == null) {
                            ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand.b = (ahbe)new agzb((agzi)ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand.a;
            }
            case 4: {
                return new agza((agzi)ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand.a);
            }
            case 3: {
                return new ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand();
            }
            case 2: {
                return newMessageInfo((MessageLite)ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand.a, "\u0001\u0000", (Object[])null);
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
