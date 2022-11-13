import com.google.protos.youtube.api.innertube.ChannelListSubMenuRendererOuterClass;
import com.google.protos.youtube.api.innertube.CompactListItemRendererOuterClass;
import com.google.protos.youtube.api.innertube.SectionListRendererOuterClass;
import com.google.protos.youtube.api.innertube.ItemSectionRendererOuterClass;
import com.google.protos.youtube.api.innertube.HorizontalListRendererOuterClass;
import com.google.protos.youtube.api.innertube.PlaylistVideoRendererOuterClass;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.CompanionAdRendererOuterClass;
import com.google.protos.youtube.api.innertube.AlertRendererOuterClass;
import com.google.protos.youtube.api.innertube.PlayerThreedRendererOuterClass;
import com.google.protos.youtube.api.innertube.MessageRendererOuterClass;
import com.google.protos.youtube.api.innertube.OfflineabilityRendererOuterClass;
import com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.AppPromoCompanionAdRendererOuterClass;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;
import com.google.protos.youtube.api.innertube.DropdownRendererOuterClass;
import com.google.protos.youtube.api.innertube.SortFilterSubMenuRendererOuterClass;
import com.google.protos.youtube.api.innertube.CompactLinkRendererOuterClass;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.InlinePlaybackRendererOuterClass;
import com.google.protos.youtube.api.innertube.AutoplayRendererOuterClass;
import com.google.protos.youtube.api.innertube.FancyDismissibleDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.UpsellDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.LugashFooterRendererOuterClass;
import com.google.protos.youtube.api.innertube.TextInputRendererOuterClass;
import com.google.protos.youtube.api.innertube.GamingSupportedRenderers;
import com.google.protos.youtube.api.innertube.CommentShareboxRenderer;
import com.google.protos.youtube.api.innertube.BackgroundPromoRendererOuterClass;
import com.google.protos.youtube.api.innertube.ExpandButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.NotificationActionRendererOuterClass;
import com.google.protos.youtube.api.innertube.ThumbnailsRenderer;
import com.google.protos.youtube.api.innertube.HintRendererOuterClass;
import com.google.protos.youtube.api.innertube.SkipAdRendererOuterClass;
import com.google.protos.youtube.api.innertube.AdPreviewRendererOuterClass;
import com.google.protos.youtube.api.innertube.SurveyRenderer;
import com.google.protos.youtube.api.innertube.LiveChatRendererOuterClass;
import com.google.protos.youtube.api.innertube.YpcUpgradeDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.VideoCardRendererOuterClass;
import com.google.protos.youtube.api.innertube.RichListHeaderRendererOuterClass;
import com.google.protos.youtube.api.innertube.StreamStatisticRendererOuterClass;
import com.google.protos.youtube.api.innertube.RefinementChipRendererOuterClass;
import com.google.protos.youtube.api.innertube.InputTextRendererOuterClass;
import com.google.protos.youtube.api.innertube.InputSelectRendererOuterClass;
import com.google.protos.youtube.api.innertube.InputBooleanRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveErrorRendererOuterClass;
import com.google.protos.youtube.api.innertube.EmojiPickerRendererOuterClass;
import com.google.protos.youtube.api.innertube.ContentPillRendererOuterClass;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatHeaderRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatRestrictedParticipationRendererOuterClass;
import com.google.protos.youtube.api.innertube.AppPromoAdCtaRendererOuterClass;
import com.google.protos.youtube.api.innertube.NativeAdBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.EngagementPanelSectionListRendererOuterClass;
import com.google.protos.youtube.api.innertube.EngagementPanelTitleHeaderRendererOuterClass;
import com.google.protos.youtube.api.innertube.CarouselItemRendererOuterClass;
import com.google.protos.youtube.api.innertube.GhostCardRendererOuterClass;
import com.google.protos.youtube.api.innertube.MobileBroadcastSetupMoreOptionsRendererOuterClass;
import com.google.protos.youtube.api.innertube.InputDateTimeRendererOuterClass;
import com.google.protos.youtube.api.innertube.BroadcastStatusRendererOuterClass;
import com.google.protos.youtube.api.innertube.MobileBroadcastSetupEventButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MobilePlaceResultRendererOuterClass;
import com.google.protos.youtube.api.innertube.BrandInteractionRendererOuterClass;
import com.google.protos.youtube.api.innertube.LocationEditRendererOuterClass;
import com.google.protos.youtube.api.innertube.TooltipRendererOuterClass;
import com.google.protos.youtube.api.innertube.CompactCompanionAdRendererOuterClass;
import com.google.protos.youtube.api.innertube.CompactCompanionExtensionRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelCreationTrayRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelCameraRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelEditVideoRendererOuterClass;
import com.google.protos.youtube.api.innertube.TranscriptRendererOuterClass;
import com.google.protos.youtube.api.innertube.ClarificationRendererOuterClass;
import com.google.protos.youtube.api.innertube.GamingAccountLinkSettingRendererOuterClass;
import com.google.protos.youtube.api.innertube.MultiItemCompanionAdRendererOuterClass;
import com.google.protos.youtube.api.innertube.CommentSectionRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelVodLinkRendererOuterClass;
import com.google.protos.youtube.api.innertube.CollapsibleAdCtaRendererOuterClass;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;
import com.google.protos.youtube.api.innertube.CompanionSponsoredButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.AdCtaButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import com.google.protos.youtube.api.innertube.PhonebookRenderer;
import com.google.protos.youtube.api.innertube.TvfilmOffersRendererOuterClass;
import com.google.protos.youtube.api.innertube.StickerCatalogHeaderRendererOuterClass;
import com.google.protos.youtube.api.innertube.StickerPageRendererOuterClass;
import com.google.protos.youtube.api.innertube.StickerPageSelectorRendererOuterClass;
import com.google.protos.youtube.api.innertube.SimpleAdBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.StatusUpdateNotificationRendererOuterClass;
import com.google.protos.youtube.api.innertube.SurveyTextInterstitialRendererOuterClass;
import com.google.protos.youtube.api.innertube.PrefilledFormCompanionExtensionRendererOuterClass;
import com.google.protos.youtube.api.innertube.MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer;
import com.google.protos.youtube.api.innertube.CreationReelPickerRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelCreationMetadataRendererOuterClass;
import com.google.protos.youtube.api.innertube.BackstagePostDialogCreatorOnboardingPromoRendererOuterClass;
import com.google.protos.youtube.api.innertube.AdClickCommandRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelPickerItemRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelPickerButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.SponsorshipConfirmCancelRendererOuterClass;
import com.google.protos.youtube.api.innertube.RedCarpetVideoRendererOuterClass;
import com.google.protos.youtube.api.innertube.FeedbackSurveyRendererOuterClass;
import com.google.protos.youtube.api.innertube.CompactSuggestedVideoRendererOuterClass;
import com.google.protos.youtube.api.innertube.SuggestedVideosHeaderRendererOuterClass;
import com.google.protos.youtube.api.innertube.SuggestedVideoRendererOuterClass;
import com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer;
import com.google.protos.youtube.api.innertube.FormfillInputRendererOuterClass;
import com.google.protos.youtube.api.innertube.FormfillTextInputRendererOuterClass;
import com.google.protos.youtube.api.innertube.CommandWrapperPromoRendererOuterClass;
import com.google.protos.youtube.api.innertube.FormfillPhoneNumberInputRendererOuterClass;
import com.google.protos.youtube.api.innertube.PerksSectionRendererOuterClass;
import com.google.protos.youtube.api.innertube.UnpluggedPauseMembershipDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.StickerCatalogRendererOuterClass;
import com.google.protos.youtube.api.innertube.MultiReelDismissalRendererOuterClass;
import com.google.protos.youtube.api.innertube.SimpleSearchFilterGroupRendererOuterClass;
import com.google.protos.youtube.api.innertube.RelatedChipCloudRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatProductButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.GeoSearchDetailsRendererOuterClass;
import com.google.protos.youtube.api.innertube.GamingAccountLinkConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.SettingRenderer;
import com.google.protos.youtube.api.innertube.LiveChatItemRenderer;
import com.google.protos.youtube.api.innertube.LiveChatMessageBuyFlowRendererOuterClass;
import com.google.protos.youtube.api.innertube.PlayerMutedAutoplayOverlayRendererOuterClass;
import com.google.protos.youtube.api.innertube.AdThumbnailDetailsButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer;
import com.google.protos.youtube.api.innertube.UnicodeEmojiStickerPageRendererOuterClass;
import com.google.protos.youtube.api.innertube.PasswordAuthRendererOuterClass$PasswordAuthRenderer;
import com.google.protos.youtube.api.innertube.FingerprintAuthRendererOuterClass$FingerprintAuthRenderer;
import com.google.protos.youtube.api.innertube.ExpandableSurveyRenderer;
import com.google.protos.youtube.api.innertube.RelatedChipContinuation;
import com.google.protos.youtube.api.innertube.BackstagePrefilledPostDialogHeaderRendererOuterClass;
import com.google.protos.youtube.api.innertube.UserMentionSuggestionRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatPaidStickerRendererOuterClass;
import com.google.protos.youtube.api.innertube.IconTextBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.RecentlyUsedStickerPageRendererOuterClass;
import com.google.protos.youtube.api.innertube.AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer;
import com.google.protos.youtube.api.innertube.CommentStickerRendererOuterClass;
import com.google.protos.youtube.api.innertube.MetadataRowContainerRendererOuterClass;
import com.google.protos.youtube.api.innertube.MiniplayerRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementsAdCtaRendererOuterClass;
import com.google.protos.youtube.api.innertube.SuperStickerPackRendererOuterClass;
import com.google.protos.youtube.api.innertube.StorageInfoRendererOuterClass;
import com.google.protos.youtube.api.innertube.MultiMessageConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.InputGameTitleRendererOuterClass;
import com.google.protos.youtube.api.innertube.EndorsementMetadataSwapRendererOuterClass;
import com.google.protos.youtube.api.innertube.IconMessageRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer;
import com.google.protos.youtube.api.innertube.PlayerOverlayVideoInteractionsOuterClass;
import com.google.protos.youtube.api.innertube.ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer;
import com.google.protos.youtube.api.innertube.FormfillCheckboxInputRendererOuterClass;
import com.google.protos.youtube.api.innertube.EffectListRendererOuterClass;
import com.google.protos.youtube.api.innertube.EffectListItemRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatActionPanelRendererOuterClass;
import com.google.protos.youtube.api.innertube.RequiredSignInRendererOuterClass;
import com.google.protos.youtube.api.innertube.ImagePreviewSelectRendererOuterClass;
import com.google.protos.youtube.api.innertube.PollRendererOuterClass;
import com.google.protos.youtube.api.innertube.TargetedAudienceSelectRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatBannerHeaderRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatBannerRendererOuterClass;
import com.google.protos.youtube.api.innertube.FullscreenEngagementOverlayRendererOuterClass;
import com.google.protos.youtube.api.innertube.FullscreenEngagementCompanionRendererOuterClass;
import com.google.protos.youtube.api.innertube.FormfillDropdownInputRendererOuterClass;
import com.google.protos.youtube.api.innertube.ElementsSectionListFooterRendererOuterClass;
import com.google.protos.youtube.api.innertube.BackstageRepostCreationRendererOuterClass;
import com.google.protos.youtube.api.innertube.AccountLinkButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.FirstTimeUnicornSignInRendererOuterClass;
import com.google.protos.youtube.api.innertube.VcBalanceRendererOuterClass;
import com.google.protos.youtube.api.innertube.SuggestedActionsRendererOuterClass;
import com.google.protos.youtube.api.innertube.SlimVideoMetadataRendererOuterClass;
import com.google.protos.youtube.api.innertube.DateTimePickerRendererOuterClass;
import com.google.protos.youtube.api.innertube.SlimVideoMetadataSectionRendererOuterClass;
import com.google.protos.youtube.api.innertube.BadgeRenderers;
import com.google.protos.youtube.api.innertube.PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer;
import com.google.protos.youtube.api.innertube.EngagementPanelSectionListRendererOuterClass$EngagementPanelTabRenderer;
import com.google.protos.youtube.api.innertube.WebLinkRendererOuterClass;
import com.google.protos.youtube.api.innertube.ConnectGpgDialogRenderer;
import com.google.protos.youtube.api.innertube.AutoplaySwitchButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.CreatePlaylistDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer;
import com.google.protos.youtube.api.innertube.ImageCarouselEditorRendererOuterClass;
import com.google.protos.youtube.api.innertube.SfvAudioPickerHeaderRendererOuterClass;
import com.google.protos.youtube.api.innertube.SelectImageCellRendererOuterClass;
import com.google.protos.youtube.api.innertube.PostImagePickerRendererOuterClass;
import com.google.protos.youtube.api.innertube.SfvAudioSearchBoxRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelWatchSurveyRendererOuterClass;
import com.google.protos.youtube.api.innertube.UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer;
import com.google.protos.youtube.api.innertube.ChipCloudRendererOuterClass;
import com.google.protos.youtube.api.innertube.DecoratedPlayerBarRendererOuterClass;
import com.google.protos.youtube.api.innertube.HomeAdsPanelRendererOuterClass;
import com.google.protos.youtube.api.innertube.TopbarCastButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShortsEditRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveFullscreenConfirmRendererOuterClass;
import com.google.protos.youtube.api.innertube.AboutThisAdRendererOuterClass;
import com.google.protos.youtube.api.innertube.AccountsListRenderer;
import com.google.protos.youtube.api.innertube.UnifiedSharePanelRendererOuterClass;
import com.google.protos.youtube.api.innertube.ProductRendererOuterClass;
import com.google.protos.youtube.api.innertube.AdsInlineWebsiteRendererOuterClass;
import com.google.protos.youtube.api.innertube.SponsorshipsRenderers;
import com.google.protos.youtube.api.innertube.FeedFilterChipBarRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShortsCameraRendererOuterClass;
import com.google.protos.youtube.api.innertube.BelowPlayerImmersiveAdLayoutRendererOuterClass;
import com.google.protos.youtube.api.innertube.IconBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.FormfillConditionalDropdownInputRendererOuterClass;
import com.google.protos.youtube.api.innertube.AdEngagementPanelsRendererOuterClass;
import com.google.protos.youtube.api.innertube.BroadcastParticipantJoinScreenRendererOuterClass;
import com.google.protos.youtube.api.innertube.FlowStepRendererOuterClass;
import com.google.protos.youtube.api.innertube.TvfilmOfferModuleRendererOuterClass;
import com.google.protos.youtube.api.innertube.FlowTopBarRendererOuterClass;
import com.google.protos.youtube.api.innertube.SelectTaggedVideoButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.ChannelHandleValidationResultRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShortsCreationTitleRendererOuterClass;
import com.google.protos.youtube.api.innertube.HeatmapRendererOuterClass;
import com.google.protos.youtube.api.innertube.HeatMarkerRendererOuterClass;
import com.google.protos.youtube.api.innertube.InlineBrowserCustomTabsRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelNonVideoContentRendererOuterClass;
import com.google.protos.youtube.api.innertube.SpotlightRendererOuterClass;
import com.google.protos.youtube.api.innertube.PlayerOverlayLayerRendererOuterClass;
import com.google.protos.youtube.api.innertube.FeaturePlayerOverlayRendererOuterClass;
import com.google.protos.youtube.api.innertube.ChapterMarkerMessagePlayerScrimOverlayRendererOuterClass;
import com.google.protos.youtube.api.innertube.KeyMomentsPlayerScrimOverlayRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelPlayerPausedStateRendererOuterClass;
import com.google.protos.youtube.api.innertube.PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer;
import com.google.protos.youtube.api.innertube.ImagePollEditorRendererOuterClass$ImagePollEditorRenderer;
import com.google.protos.youtube.api.innertube.FilterChipBarElementRendererOuterClass$FilterChipBarElementRenderer;
import com.google.protos.youtube.api.innertube.MiniPlayerBylineRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShortsEffectPickerEntryRendererOuterClass;
import com.google.protos.youtube.api.innertube.GenerateHandleFromNameResultRendererOuterClass;
import com.google.protos.youtube.api.innertube.PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer;
import com.google.protos.youtube.api.innertube.RecognitionShelfRendererOuterClass;
import com.google.protos.youtube.api.innertube.SwipeoverContainerRendererOuterClass$SwipeoverContainerRenderer;
import com.google.protos.youtube.api.innertube.ReelPlayerOverlayRendererOuterClass;
import com.google.protos.youtube.api.innertube.InnertubeGetReelItemWatchService;
import com.google.protos.youtube.api.innertube.CinematicContainerRendererOuterClass$CinematicContainerRenderer;
import com.google.protos.youtube.api.innertube.CreationSuggestionRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShortsLayoutPickerEntryRendererOuterClass;
import com.google.protos.youtube.api.innertube.DownloadsPageEntryPointRendererOuterClass$DownloadsPageEntryPointRenderer;
import com.google.protos.youtube.api.innertube.CardboardModeRendererOuterClass;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SignInEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;
import com.google.protos.youtube.api.innertube.MobileV2UserFeedEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflineEndpointOuterClass;
import com.google.protos.youtube.api.innertube.WatchPlaylistEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SignOutEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflineWatchEndpointOuterClass;
import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;
import com.google.protos.youtube.api.innertube.AndroidApplicationEndpointOuterClass;
import com.google.protos.youtube.api.innertube.AppStoreEndpointOuterClass;
import com.google.protos.youtube.api.innertube.DismissalEndpointOuterClass$DismissalEndpoint;
import com.google.protos.youtube.api.innertube.ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint;
import com.google.protos.youtube.api.innertube.PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint;
import com.google.protos.youtube.api.innertube.ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint;
import com.google.protos.youtube.api.innertube.LikeEndpointOuterClass$LikeEndpoint;
import com.google.protos.youtube.api.innertube.UploadEndpointOuterClass;
import com.google.protos.youtube.api.innertube.EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint;
import com.google.protos.youtube.api.innertube.DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.DeleteVideoEndpointOuterClass$DeleteVideoEndpoint;
import com.google.protos.youtube.api.innertube.YpcOffersEndpoint$YPCOffersEndpoint;
import com.google.protos.youtube.api.innertube.RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint;
import com.google.protos.youtube.api.innertube.NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint;
import com.google.protos.youtube.api.innertube.YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint;
import com.google.protos.youtube.api.innertube.FeedbackEndpointOuterClass;
import com.google.protos.youtube.api.innertube.PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint;
import com.google.protos.youtube.api.innertube.DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint;
import com.google.protos.youtube.api.innertube.CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint;
import com.google.protos.youtube.api.innertube.CreateCommentEndpointOuterClass$CreateCommentEndpoint;
import com.google.protos.youtube.api.innertube.SubscribeEndpointOuterClass$SubscribeEndpoint;
import com.google.protos.youtube.api.innertube.UnsubscribeEndpointOuterClass$UnsubscribeEndpoint;
import com.google.protos.youtube.api.innertube.MuteAdEndpointOuterClass$MuteAdEndpoint;
import com.google.protos.youtube.api.innertube.AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint;
import com.google.protos.youtube.api.innertube.MdxPairingEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint;
import com.google.protos.youtube.api.innertube.UserFeedbackEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.ShareVideoEndpointOuterClass$ShareVideoEndpoint;
import com.google.protos.youtube.api.innertube.SharePlaylistEndpointOuterClass$SharePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.CaptionPickerEndpointOuterClass$CaptionPickerEndpoint;
import com.google.protos.youtube.api.innertube.FlagVideoEndpointOuterClass$FlagVideoEndpoint;
import com.google.protos.youtube.api.innertube.ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint;
import com.google.protos.youtube.api.innertube.SendSmsEndpointOuterClass$SendSmsEndpoint;
import com.google.protos.youtube.api.innertube.UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint;
import com.google.protos.youtube.api.innertube.AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint;
import com.google.protos.youtube.api.innertube.AddToToastActionOuterClass$AddToToastAction;
import com.google.protos.youtube.api.innertube.FlagEndpointOuterClass$FlagEndpoint;
import com.google.protos.youtube.api.innertube.ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint;
import com.google.protos.youtube.api.innertube.SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint;
import com.google.protos.youtube.api.innertube.InviteMoreEndpointOuterClass$InviteMoreEndpoint;
import com.google.protos.youtube.api.innertube.ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction;
import com.google.protos.youtube.api.innertube.HideEnclosingActionOuterClass$HideEnclosingAction;
import com.google.protos.youtube.api.innertube.WebviewEndpointOuterClass$WebviewEndpoint;
import com.google.protos.youtube.api.innertube.VideoQualityPickerEndpointOuterClass$VideoQualityPickerEndpoint;
import com.google.protos.youtube.api.innertube.SetSettingEndpointOuterClass$SetSettingEndpoint;
import com.google.protos.youtube.api.innertube.RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint;
import com.google.protos.youtube.api.innertube.ApplicationHelpEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint;
import com.google.protos.youtube.api.innertube.AdFeedbackEndpointOuterClass$AdFeedbackEndpoint;
import com.google.protos.youtube.api.innertube.VideoManagerEndpointOuterClass$VideoManagerEndpoint;
import com.google.protos.youtube.api.innertube.ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint;
import com.google.protos.youtube.api.innertube.SetClientSettingEndpointOuterClass$SetClientSettingEndpoint;
import com.google.protos.youtube.api.innertube.AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEndpoint;
import com.google.protos.youtube.api.innertube.CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.ClearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint;
import com.google.protos.youtube.api.innertube.ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint;
import com.google.protos.youtube.api.innertube.EditConversationPostEndpointOuterClass$EditConversationPostEndpoint;
import com.google.protos.youtube.api.innertube.YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint;
import com.google.protos.youtube.api.innertube.OfflineVideosEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction;
import com.google.protos.youtube.api.innertube.ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint;
import com.google.protos.youtube.api.innertube.CopyTextEndpointOuterClass$CopyTextEndpoint;
import com.google.protos.youtube.api.innertube.EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint;
import com.google.protos.youtube.api.innertube.TextMessageEndpointOuterClass$TextMessageEndpoint;
import com.google.protos.youtube.api.innertube.CopyUrlEndpoint$CopyURLEndpoint;
import com.google.protos.youtube.api.innertube.ShareEndpointOuterClass$ShareEntityEndpoint;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToContactsEndpoint;
import com.google.protos.youtube.api.innertube.PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint;
import com.google.protos.youtube.api.innertube.CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint;
import com.google.protos.youtube.api.innertube.YpcGetCartEndpoint$YPCGetCartEndpoint;
import com.google.protos.youtube.api.innertube.ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint;
import com.google.protos.youtube.api.innertube.ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint;
import com.google.protos.youtube.api.innertube.MenuEndpointOuterClass$MenuEndpoint;
import com.google.protos.youtube.api.innertube.PingingEndpointOuterClass$PingingEndpoint;
import com.google.protos.youtube.api.innertube.ContactMenuEndpointOuterClass$ContactMenuEndpoint;
import com.google.protos.youtube.api.innertube.CameraEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UpdateCommentEndpointOuterClass$UpdateCommentEndpoint;
import com.google.protos.youtube.api.innertube.UploadPhotoEndpointOuterClass$UploadPhotoEndpoint;
import com.google.protos.youtube.api.innertube.GetPhotoEndpointOuterClass$GetPhotoEndpoint;
import com.google.protos.youtube.api.innertube.RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction;
import com.google.protos.youtube.api.innertube.AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint;
import com.google.protos.youtube.api.innertube.UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint;
import com.google.protos.youtube.api.innertube.PhoneDialerEndpointOuterClass$PhoneDialerEndpoint;
import com.google.protos.youtube.api.innertube.ChannelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint;
import com.google.protos.youtube.api.innertube.UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction;
import com.google.protos.youtube.api.innertube.RemoveContactActionOuterClass$RemoveContactAction;
import com.google.protos.youtube.api.innertube.OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint;
import com.google.protos.youtube.api.innertube.AuthorizedUrlEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UpdateViewershipActionOuterClass$UpdateViewershipAction;
import com.google.protos.youtube.api.innertube.MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint;
import com.google.protos.youtube.api.innertube.ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint;
import com.google.protos.youtube.api.innertube.SubtitlesEndpointOuterClass$SubtitlesEndpoint;
import com.google.protos.youtube.api.innertube.ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint;
import com.google.protos.youtube.api.innertube.ClearAppBadgeActionOuterClass$ClearAppBadgeAction;
import com.google.protos.youtube.api.innertube.ModalEndpointOuterClass$ModalEndpoint;
import com.google.protos.youtube.api.innertube.AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint;
import com.google.protos.youtube.api.innertube.ShowMealbarActionOuterClass$ShowMealbarAction;
import com.google.protos.youtube.api.innertube.EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint;
import com.google.protos.youtube.api.innertube.GetReportFormEndpointOuterClass$GetReportFormEndpoint;
import com.google.protos.youtube.api.innertube.ClientActionEndpointOuterClass$ClientActionEndpoint;
import com.google.protos.youtube.api.innertube.NavigateAndOpenDialogEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction;
import com.google.protos.youtube.api.innertube.PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint;
import com.google.protos.youtube.api.innertube.LiveChatAction$AddChatItemAction;
import com.google.protos.youtube.api.innertube.SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint;
import com.google.protos.youtube.api.innertube.CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint;
import com.google.protos.youtube.api.innertube.AndroidIntentActionEndpointOuterClass;
import com.google.protos.youtube.api.innertube.UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction;
import com.google.protos.youtube.api.innertube.MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint;
import com.google.protos.youtube.api.innertube.BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint;
import com.google.protos.youtube.api.innertube.SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint;
import com.google.protos.youtube.api.innertube.CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint;
import com.google.protos.youtube.api.innertube.InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint;
import com.google.protos.youtube.api.innertube.LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint;
import com.google.protos.youtube.api.innertube.LiveCreationEndpointOuterClass$LiveCreationEndpoint;
import com.google.protos.youtube.api.innertube.UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint;
import com.google.protos.youtube.api.innertube.UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint;
import com.google.protos.youtube.api.innertube.NerdStatsEndpointOuterClass$NerdStatsEndpoint;
import com.google.protos.youtube.api.innertube.AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint;
import com.google.protos.youtube.api.innertube.SignalServiceEndpointOuterClass$SignalServiceEndpoint;
import com.google.protos.youtube.api.innertube.RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint;
import com.google.protos.youtube.api.innertube.TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint;
import com.google.protos.youtube.api.innertube.UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint;
import com.google.protos.youtube.api.innertube.ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint;
import com.google.protos.youtube.api.innertube.RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction;
import com.google.protos.youtube.api.innertube.BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint;
import com.google.protos.youtube.api.innertube.LiveChatAction$AddLiveChatTextMessageFromTemplateAction;
import com.google.protos.youtube.api.innertube.AddContactsEndpointOuterClass$AddContactsEndpoint;
import com.google.protos.youtube.api.innertube.ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction;
import com.google.protos.youtube.api.innertube.EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint;
import com.google.protos.youtube.api.innertube.MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint;
import com.google.protos.youtube.api.innertube.UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint;
import com.google.protos.youtube.api.innertube.UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint;
import com.google.protos.youtube.api.innertube.AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint;
import com.google.protos.youtube.api.innertube.EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint;
import com.google.protos.youtube.api.innertube.UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint;
import com.google.protos.youtube.api.innertube.LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint;
import com.google.protos.youtube.api.innertube.RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint;
import com.google.protos.youtube.api.innertube.LiveChatAction$RemoveChatItemAction;
import com.google.protos.youtube.api.innertube.ToggleConversationActionOuterClass$ToggleConversationAction;
import com.google.protos.youtube.api.innertube.ToggleConversationEndpointOuterClass$ToggleConversationEndpoint;
import com.google.protos.youtube.api.innertube.RefreshAppActionOuterClass$RefreshAppAction;
import com.google.protos.youtube.api.innertube.ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint;
import com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint;
import com.google.protos.youtube.api.innertube.PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint;
import com.google.protos.youtube.api.innertube.LiveChatEndpointOuterClass$LiveChatEndpoint;
import com.google.protos.youtube.api.innertube.LiveChatAction$AddLiveChatTickerItemAction;
import com.google.protos.youtube.api.innertube.LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint;
import com.google.protos.youtube.api.innertube.ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint;
import com.google.protos.youtube.api.innertube.YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint;
import com.google.protos.youtube.api.innertube.LiveChatAction$MarkChatItemsByAuthorAsDeletedAction;
import com.google.protos.youtube.api.innertube.MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint;
import com.google.protos.youtube.api.innertube.PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint;
import com.google.protos.youtube.api.innertube.ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction;
import com.google.protos.youtube.api.innertube.LiveChatAction$MarkChatItemAsDeletedAction;
import com.google.protos.youtube.api.innertube.ShowContentPillActionOuterClass$ShowContentPillAction;
import com.google.protos.youtube.api.innertube.ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint;
import com.google.protos.youtube.api.innertube.ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint;
import com.google.protos.youtube.api.innertube.LiveChatAction$DimChatItemAction;
import com.google.protos.youtube.api.innertube.UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction;
import com.google.protos.youtube.api.innertube.EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint;
import com.google.protos.youtube.api.innertube.CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint;
import com.google.protos.youtube.api.innertube.YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.AddBroadcastParticipantCommandOuterClass;
import com.google.protos.youtube.api.innertube.UpdateBroadcastParticipantCommandOuterClass;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.protos.youtube.api.innertube.UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction;
import com.google.protos.youtube.api.innertube.UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction;
import com.google.protos.youtube.api.innertube.LightweightCameraEndpointOuterClass$LightweightCameraEndpoint;
import com.google.protos.youtube.api.innertube.OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint;
import com.google.protos.youtube.api.innertube.ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand;
import com.google.protos.youtube.api.innertube.SwitchCameraEndpointOuterClass$SwitchCameraEndpoint;
import com.google.protos.youtube.api.innertube.ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint;
import com.google.protos.youtube.api.innertube.MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint;
import com.google.protos.youtube.api.innertube.CameraFlashEndpointOuterClass$CameraFlashEndpoint;
import com.google.protos.youtube.api.innertube.ModifyActivityCountActionOuterClass$ModifyActivityCountAction;
import com.google.protos.youtube.api.innertube.ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint;
import com.google.protos.youtube.api.innertube.CreationEntryEndpointOuterClass$CreationEntryEndpoint;
import com.google.protos.youtube.api.innertube.LiveChatAction$ReplayChatItemAction;
import com.google.protos.youtube.api.innertube.OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction;
import com.google.protos.youtube.api.innertube.CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint;
import com.google.protos.youtube.api.innertube.LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint;
import com.google.protos.youtube.api.innertube.GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint;
import com.google.protos.youtube.api.innertube.ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction;
import com.google.protos.youtube.api.innertube.GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint;
import com.google.protos.youtube.api.innertube.StartStreamEndpointOuterClass$StartStreamEndpoint;
import com.google.protos.youtube.api.innertube.InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint;
import com.google.protos.youtube.api.innertube.UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint;
import com.google.protos.youtube.api.innertube.LiveChatAction$ReplaceChatItemAction;
import com.google.protos.youtube.api.innertube.VarispeedPickerEndpointOuterClass$VarispeedPickerEndpoint;
import com.google.protos.youtube.api.innertube.YpcUpdateFopEndpoint$YPCUpdateFopEndpoint;
import com.google.protos.youtube.api.innertube.ShowInterstitialActionOuterClass$ShowInterstitialAction;
import com.google.protos.youtube.api.innertube.YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint;
import com.google.protos.youtube.api.innertube.DeleteReelItem$DeleteReelItemEndpoint;
import com.google.protos.youtube.api.innertube.YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint;
import com.google.protos.youtube.api.innertube.GoogleMapsNavigationEndpointOuterClass;
import com.google.protos.youtube.api.innertube.StickerCatalogEndpointOuterClass$StickerCatalogEndpoint;
import com.google.protos.youtube.api.innertube.AddPlaceEndpointOuterClass$AddPlaceEndpoint;
import com.google.protos.youtube.api.innertube.ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint;
import com.google.protos.youtube.api.innertube.VideoSelectedActionOuterClass$VideoSelectedAction;
import com.google.protos.youtube.api.innertube.ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint;
import com.google.protos.youtube.api.innertube.PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint;
import com.google.protos.youtube.api.innertube.ScanCodeEndpointOuterClass$ScanCodeEndpoint;
import com.google.protos.youtube.api.innertube.FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint;
import com.google.protos.youtube.api.innertube.InlineUnmuteEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SurveyEndpointOuterClass$SurveyEndpoint;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint;
import com.google.protos.youtube.api.innertube.MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint;
import com.google.protos.youtube.api.innertube.YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint;
import com.google.protos.youtube.api.innertube.TimeDelayedEndpoint$CreateTimeDelayedEndpoint;
import com.google.protos.youtube.api.innertube.CompleteTransactionActionOuterClass$CompleteTransactionAction;
import com.google.protos.youtube.api.innertube.ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction;
import com.google.protos.youtube.api.innertube.RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction;
import com.google.protos.youtube.api.innertube.TimeDelayedEndpoint$CancelTimeDelayedEndpoint;
import com.google.protos.youtube.api.innertube.ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint;
import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;
import com.google.protos.youtube.api.innertube.MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint;
import com.google.protos.youtube.api.innertube.ReplaceBackstagePostActionOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatAction$ShowLiveChatDialogAction;
import com.google.protos.youtube.api.innertube.ModifyReportFormCommandOuterClass$ModifyReportFormCommand;
import com.google.protos.youtube.api.innertube.OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint;
import com.google.protos.youtube.api.innertube.ShowSystemToastActionOuterClass$ShowSystemToastAction;
import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
import com.google.protos.youtube.api.innertube.RefreshCommandOuterClass$RefreshCommand;
import com.google.protos.youtube.api.innertube.AppDeepLinkEndpointOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatAction;
import com.google.protos.youtube.api.innertube.BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand;
import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.OpenDialogCommandOuterClass$OpenDialogCommand;
import com.google.protos.youtube.api.innertube.MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand;
import com.google.protos.youtube.api.innertube.RelatedChipEndpoint$RelatedChipCommand;
import com.google.protos.youtube.api.innertube.LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand;
import com.google.protos.youtube.api.innertube.RefreshConfigCommandOuterClass$RefreshConfigCommand;
import com.google.protos.youtube.api.innertube.YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand;
import com.google.protos.youtube.api.innertube.YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand;
import com.google.protos.youtube.api.innertube.LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand;
import com.google.protos.youtube.api.innertube.SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand;
import com.google.protos.youtube.api.innertube.GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand;
import com.google.protos.youtube.api.innertube.GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand;
import com.google.protos.youtube.api.innertube.AccountLinkCommandOuterClass$AccountLinkCommand;
import com.google.protos.youtube.api.innertube.AccountUnlinkCommandOuterClass$AccountUnlinkCommand;
import com.google.protos.youtube.api.innertube.AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand;
import com.google.protos.youtube.api.innertube.ShowTooltipCommandOuterClass;
import com.google.protos.youtube.api.innertube.SetAppThemeCommandOuterClass$SetAppThemeCommand;
import com.google.protos.youtube.api.innertube.InlineAuthCommandOuterClass$InlineAuthCommand;
import com.google.protos.youtube.api.innertube.OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand;
import com.google.protos.youtube.api.innertube.PreloadAppStoreCommandOuterClass;
import com.google.protos.youtube.api.innertube.ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand;
import com.google.protos.youtube.api.innertube.InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand;
import com.google.protos.youtube.api.innertube.OpenAdsWebViewInBrowserCommandOuterClass;
import com.google.protos.youtube.api.innertube.ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand;
import com.google.protos.youtube.api.innertube.ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand;
import com.google.protos.youtube.api.innertube.ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand;
import com.google.protos.youtube.api.innertube.ProfileCardCommandOuterClass$ProfileCardCommand;
import com.google.protos.youtube.api.innertube.CreateLivestreamHighlightClipCommandOuterClass;
import com.google.protos.youtube.api.innertube.UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint;
import com.google.protos.youtube.api.innertube.YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand;
import com.google.protos.youtube.api.innertube.CreatePostCommandOuterClass;
import com.google.protos.youtube.api.innertube.AppIsInstalledCommandOuterClass;
import com.google.protos.youtube.api.innertube.UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand;
import com.google.protos.youtube.api.innertube.LiveChatAction$ForceLiveChatContinuationCommand;
import com.google.protos.youtube.api.innertube.StopBroadcastOptionCommandOuterClass$StopBroadcastOptionCommand;
import com.google.protos.youtube.api.innertube.ClickLoggingWrapperCommandOuterClass;
import com.google.protos.youtube.api.innertube.HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand;
import com.google.protos.youtube.api.innertube.ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand;
import com.google.protos.youtube.api.innertube.GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand;
import com.google.protos.youtube.api.innertube.AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand;
import com.google.protos.youtube.api.innertube.CloseSuggestedPlaylistVideosSheetCommandOuterClass$CloseSuggestedPlaylistVideosSheetCommand;
import com.google.protos.youtube.api.innertube.LiveChatAction$ShowLiveChatActionPanelAction;
import com.google.protos.youtube.api.innertube.LiveChatAction$CancelVoteAction;
import com.google.protos.youtube.api.innertube.LiveChatAction$UpdateLiveChatPollAction;
import com.google.protos.youtube.api.innertube.SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint;
import com.google.protos.youtube.api.innertube.ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand;
import com.google.protos.youtube.api.innertube.LiveChatAction$CloseLiveChatActionPanelAction;
import com.google.protos.youtube.api.innertube.UpdateImagePreviewCommandOuterClass;
import com.google.protos.youtube.api.innertube.ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand;
import com.google.protos.youtube.api.innertube.ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand;
import com.google.protos.youtube.api.innertube.LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand;
import com.google.protos.youtube.api.innertube.ResetSearchBarCommandOuterClass$ResetSearchBarCommand;
import com.google.protos.youtube.api.innertube.EnterVrModeCommandOuterClass$EnterVrModeCommand;
import com.google.protos.youtube.api.innertube.LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand;
import com.google.protos.youtube.api.innertube.ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand;
import com.google.protos.youtube.api.innertube.ImagePreviewSelectCommandOuterClass;
import com.google.protos.youtube.api.innertube.AddBannerToLiveChatCommandOuterClass;
import com.google.protos.youtube.api.innertube.LoopCommandOuterClass$LoopCommand;
import com.google.protos.youtube.api.innertube.RemoveBannerFromLiveChatCommandOuterClass;
import com.google.protos.youtube.api.innertube.DisableAutoplayCommandOuterClass$DisableAutoplayCommand;
import com.google.protos.youtube.api.innertube.EnableAutoplayCommandOuterClass$EnableAutoplayCommand;
import com.google.protos.youtube.api.innertube.CloseSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand;
import com.google.protos.youtube.api.innertube.SaveImageToDeviceEndpointOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatActionEndpointOuterClass$LiveChatActionEndpoint;
import com.google.protos.youtube.api.innertube.GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand;
import com.google.protos.youtube.api.innertube.CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand;
import com.google.protos.youtube.api.innertube.WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand;
import com.google.protos.youtube.api.innertube.RunAttestationCommandOuterClass$RunAttestationCommand;
import com.google.protos.youtube.api.innertube.LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand;
import com.google.protos.youtube.api.innertube.ShowSchedulingPanelCommandOuterClass;
import com.google.protos.youtube.api.innertube.RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand;
import com.google.protos.youtube.api.innertube.GetSurveyCommandOuterClass$GetSurveyCommand;
import com.google.protos.youtube.api.innertube.SubmitSurveyCommandOuterClass$SubmitSurveyCommand;
import com.google.protos.youtube.api.innertube.MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand;
import com.google.protos.youtube.api.innertube.YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand;
import com.google.protos.youtube.api.innertube.ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand;
import com.google.protos.youtube.api.innertube.ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint;
import com.google.protos.youtube.api.innertube.LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand;
import com.google.protos.youtube.api.innertube.EntityUpdateCommandOuterClass$EntityUpdateCommand;
import com.google.protos.youtube.api.innertube.ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint;
import com.google.protos.youtube.api.innertube.CreateGpgProfileCommand$CreateGPGProfileCommand;
import com.google.protos.youtube.api.innertube.ConnectGpgDialogCommand$ConnectGPGDialogCommand;
import com.google.protos.youtube.api.innertube.StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand;
import com.google.protos.youtube.api.innertube.PlayerToastCommandOuterClass;
import com.google.protos.youtube.api.innertube.ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint;
import com.google.protos.youtube.api.innertube.RemoveRendererFromItemSectionActionOuterClass;
import com.google.protos.youtube.api.innertube.AddRendererToItemSectionActionOuterClass;
import com.google.protos.youtube.api.innertube.ShortsCreationEndpointOuterClass$ShortsCreationEndpoint;
import com.google.protos.youtube.api.innertube.ReplaceItemSectionHeaderActionOuterClass;
import com.google.protos.youtube.api.innertube.TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand;
import com.google.protos.youtube.api.innertube.AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand;
import com.google.protos.youtube.api.innertube.EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint;
import com.google.protos.youtube.api.innertube.SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand;
import com.google.protos.youtube.api.innertube.SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand;
import com.google.protos.youtube.api.innertube.CommentUserFeedbackEndpointOuterClass;
import com.google.protos.youtube.api.innertube.LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand;
import com.google.protos.youtube.api.innertube.AdsWebsiteDeepLinkCommandOuterClass;
import com.google.protos.youtube.api.innertube.SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand;
import com.google.protos.youtube.api.innertube.SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand;
import com.google.protos.youtube.api.innertube.AgeVerificationEndpointOuterClass$AgeVerificationEndpoint;
import com.google.protos.youtube.api.innertube.InAppUpdateCommandOuterClass;
import com.google.protos.youtube.api.innertube.DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand;
import com.google.protos.youtube.api.innertube.GetLocationCommandOuterClass$GetLocationCommand;
import com.google.protos.youtube.api.innertube.ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand;
import com.google.protos.youtube.api.innertube.CpidRefreshCommandOuterClass;
import com.google.protos.youtube.api.innertube.CreateShortFromSourceCommandOuterClass$CreateShortFromSourceCommand;
import com.google.protos.youtube.api.innertube.ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand;
import com.google.protos.youtube.api.innertube.DismissCommentDialogEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand;
import com.google.protos.youtube.api.innertube.ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand;
import com.google.protos.youtube.api.innertube.DismissDialogEndpointOuterClass$DismissDialogEndpoint;
import com.google.protos.youtube.api.innertube.ShowPromoCommandOuterClass$ShowPromoCommand;
import com.google.protos.youtube.api.innertube.HomeAdsPanelShowCommandOuterClass;
import com.google.protos.youtube.api.innertube.HomeAdsPanelHideCommandOuterClass;
import com.google.protos.youtube.api.innertube.AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint;
import com.google.protos.youtube.api.innertube.ShowShareWithKidsPanelCommandOuterClass;
import com.google.protos.youtube.api.innertube.YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint;
import com.google.protos.youtube.api.innertube.ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand;
import com.google.protos.youtube.api.innertube.AppBrowserPrewarmAndPreconnectCommandOuterClass;
import com.google.protos.youtube.api.innertube.UpdateKidsAllowlistCommandOuterClass;
import com.google.protos.youtube.api.innertube.AppStoreOverlayCommandOuterClass;
import com.google.protos.youtube.api.innertube.SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand;
import com.google.protos.youtube.api.innertube.LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand;
import com.google.protos.youtube.api.innertube.ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand;
import com.google.protos.youtube.api.innertube.ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand;
import com.google.protos.youtube.api.innertube.AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand;
import com.google.protos.youtube.api.innertube.SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand;
import com.google.protos.youtube.api.innertube.SectionReloadCommandOuterClass$SectionReloadCommand;
import com.google.protos.youtube.api.innertube.AutoconnectEndpointOuterClass$AutoconnectEndpoint;
import com.google.protos.youtube.api.innertube.CommerceActionCommandOuterClass$CommerceActionCommand;
import com.google.protos.youtube.api.innertube.FilterChipTransformCommandOuterClass$FilterChipTransformCommand;
import com.google.protos.youtube.api.innertube.DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand;
import com.google.protos.youtube.api.innertube.LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand;
import com.google.protos.youtube.api.innertube.EnableSingleVideoPlaybackLoopCommandOuterClass$EnableSingleVideoPlaybackLoopCommand;
import com.google.protos.youtube.api.innertube.DisableSingleVideoPlaybackLoopCommandOuterClass$DisableSingleVideoPlaybackLoopCommand;
import com.google.protos.youtube.api.innertube.GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand;
import com.google.protos.youtube.api.innertube.CloseStreamEndScreenCommandOuterClass;
import com.google.protos.youtube.api.innertube.FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand;
import com.google.protos.youtube.api.innertube.SetAdsPlayerFullscreenStateCommandOuterClass$SetAdsPlayerFullscreenStateCommand;
import com.google.protos.youtube.api.innertube.LeaveBroadcastCommandOuterClass;
import com.google.protos.youtube.api.innertube.AboutThisAdEndpointOuterClass$AboutThisAdEndpoint;
import com.google.protos.youtube.api.innertube.DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand;
import com.google.protos.youtube.api.innertube.NavigateBackCommandOuterClass$NavigateBackCommand;
import com.google.protos.youtube.api.innertube.ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand;
import com.google.protos.youtube.api.innertube.ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand;
import com.google.protos.youtube.api.innertube.ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand;
import com.google.protos.youtube.api.innertube.GetFlowCommandOuterClass$GetFlowCommand;
import com.google.protos.youtube.api.innertube.UpdateFlowCommandOuterClass$UpdateFlowCommand;
import com.google.protos.youtube.api.innertube.ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand;
import com.google.protos.youtube.api.innertube.DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand;
import com.google.protos.youtube.api.innertube.PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand;
import com.google.protos.youtube.api.innertube.UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand;
import com.google.protos.youtube.api.innertube.SharingProviderDataCommandOuterClass$SharingProviderDataCommand;
import com.google.protos.youtube.api.innertube.StoriesShareCommandOuterClass$StoriesShareCommand;
import com.google.protos.youtube.api.innertube.RegisterTasksCommandOuterClass$RegisterTasksCommand;
import com.google.protos.youtube.api.innertube.CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand;
import com.google.protos.youtube.api.innertube.EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand;
import com.google.protos.youtube.api.innertube.ChannelPageContinuationCommandOuterClass$ChannelPageContinuationCommand;
import com.google.protos.youtube.api.innertube.RefreshPanelEndpointOuterClass$RefreshPanelEndpoint;
import com.google.protos.youtube.api.innertube.PlayBillingCommandOuterClass$PlayBillingCommand;
import com.google.protos.youtube.api.innertube.GetDownloadActionCommandOuterClass$GetDownloadActionCommand;
import com.google.protos.youtube.api.innertube.ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand;
import com.google.protos.youtube.api.innertube.WebviewAuthCommand$WebViewAuthCommand;
import com.google.protos.youtube.api.innertube.PrefetchWatchCommandOuterClass$PrefetchWatchCommand;
import com.google.protos.youtube.api.innertube.UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand;
import com.google.protos.youtube.api.innertube.LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand;
import com.google.protos.youtube.api.innertube.ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand;
import com.google.protos.youtube.api.innertube.AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand;
import com.google.protos.youtube.api.innertube.AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand;
import com.google.protos.youtube.api.innertube.ResolveLocationCommandOuterClass$ResolveLocationCommand;
import com.google.protos.youtube.api.innertube.ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint;
import com.google.protos.youtube.api.innertube.LocationCollectionCommandOuterClass$LocationCollectionCommand;
import com.google.protos.youtube.api.innertube.UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand;
import com.google.protos.youtube.api.innertube.ShowMessageInputPromptCommandOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint;
import com.google.protos.youtube.api.innertube.DisableBeforeFocusCommandOuterClass;
import com.google.protos.youtube.api.innertube.ShareImageCommandOuterClass$ShareImageCommand;
import com.google.protos.youtube.api.innertube.PivotBarNavigationCommandOuterClass$PivotBarNavigationCommand;
import com.google.protos.youtube.api.innertube.AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand;
import com.google.protos.youtube.api.innertube.DecorateMessageEndpointOuterClass$DecorateMessageEndpoint;
import com.google.protos.youtube.api.innertube.LoadMarkersCommandOuterClass$LoadMarkersCommand;
import com.google.protos.youtube.api.innertube.FlowPrevStepCommandOuterClass$FlowPrevStepCommand;
import com.google.protos.youtube.api.innertube.ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand;
import com.google.protos.youtube.api.innertube.UpdateLatestEventCreationTimestampCommandOuterClass$UpdateLatestEventCreationTimestampCommand;
import com.google.protos.youtube.api.innertube.ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand;
import com.google.protos.youtube.api.innertube.DynamicFlowCommandOuterClass$DynamicFlowCommand;
import com.google.protos.youtube.api.innertube.RepeatChapterCommandOuterClass$RepeatChapterCommand;
import com.google.protos.youtube.api.innertube.AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand;
import com.google.protos.youtube.api.innertube.PollGetBroadcastConferenceCommandOuterClass;
import com.google.protos.youtube.api.innertube.ResetConferenceInviteUrlCommand;
import com.google.protos.youtube.api.innertube.LogYpcFlowFailureCommandOuterClass$LogYpcFlowFailureCommand;
import com.google.protos.youtube.api.innertube.LiveChatAction$ClearChatWindowAction;
import com.google.protos.youtube.api.innertube.OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand;
import com.google.protos.youtube.api.innertube.PlayBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand;
import com.google.protos.youtube.api.innertube.CloseCostreamInviteScreenCommandOuterClass$CloseCostreamInviteScreenCommand;
import com.google.protos.youtube.api.innertube.AssetItemSelectCommandOuterClass$AssetItemSelectCommand;
import com.google.protos.youtube.api.innertube.KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand;
import com.google.protos.youtube.api.innertube.OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand;
import com.google.protos.youtube.api.innertube.ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand;
import com.google.protos.youtube.api.innertube.ShowSheetCommandOuterClass$ShowSheetCommand;
import com.google.protos.youtube.api.innertube.ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand;
import com.google.protos.youtube.api.innertube.CoWatchCommandOuterClass$CoWatchCommand;
import com.google.protos.youtube.api.innertube.AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand;
import com.google.protos.youtube.api.innertube.ExecuteEntityCommandOuterClass$ExecuteEntityCommand;
import com.google.protos.youtube.api.innertube.ReloadLiveChatCommandOuterClass;
import com.google.protos.youtube.api.innertube.SaveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand;
import com.google.protos.youtube.api.innertube.EnableCinematicLightingCommandOuterClass$EnableCinematicLightingCommand;
import com.google.protos.youtube.api.innertube.DisableCinematicLightingCommandOuterClass$DisableCinematicLightingCommand;
import com.google.protos.youtube.api.innertube.CoWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand;
import com.google.protos.youtube.api.innertube.LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction;
import com.google.protos.youtube.api.innertube.ClearLocationCommandOuterClass$ClearLocationCommand;
import com.google.protos.youtube.api.innertube.WebViewActionCommandOuterClass$WebViewActionCommand;
import com.google.protos.youtube.api.innertube.GetWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand;
import com.google.protos.youtube.api.innertube.WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand;
import com.google.protos.youtube.api.innertube.QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand;
import com.google.protos.youtube.api.innertube.UpdateTimedCommentsPlaybackCommandOuterClass$UpdateTimedCommentsPlaybackCommand;
import com.google.protos.youtube.api.innertube.QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand;
import com.google.protos.youtube.api.innertube.CreationSuggestionDismissCommandOuterClass$CreationSuggestionDismissCommand;
import com.google.protos.youtube.api.innertube.DismissSuggestedActionCommandOuterClass$DismissSuggestedActionCommand;
import com.google.protos.youtube.elements.DirectUpdatePropertiesOuterClass$DirectUpdateProperties;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ExtensionRegistryLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class ahex extends ExtensionRegistryLite
{
    public ahex() {
        super((byte[])null);
    }
    
    private static final ahbf d(final MessageLite messageLite, final int n) {
        final String name = messageLite.getClass().getName();
        int n2 = 0;
        Label_1426: {
            switch (name.hashCode()) {
                case 1189152832: {
                    if (name.equals("com.google.protos.youtube.elements.SenderStateOuterClass$SenderState")) {
                        n2 = 14;
                        break Label_1426;
                    }
                    break;
                }
                case 689193950: {
                    if (name.equals("com.google.protos.youtube.elements.CommandOuterClass$Command")) {
                        n2 = 18;
                        break Label_1426;
                    }
                    break;
                }
                case 3005032: {
                    if (name.equals("atxm")) {
                        n2 = 24;
                        break Label_1426;
                    }
                    break;
                }
                case 3002084: {
                    if (name.equals("aqvj")) {
                        n2 = 56;
                        break Label_1426;
                    }
                    break;
                }
                case 3002002: {
                    if (name.equals("aqsu")) {
                        n2 = 11;
                        break Label_1426;
                    }
                    break;
                }
                case 3001847: {
                    if (name.equals("aqnu")) {
                        n2 = 53;
                        break Label_1426;
                    }
                    break;
                }
                case 3001652: {
                    if (name.equals("aqhl")) {
                        n2 = 15;
                        break Label_1426;
                    }
                    break;
                }
                case 3001648: {
                    if (name.equals("aqhh")) {
                        n2 = 19;
                        break Label_1426;
                    }
                    break;
                }
                case 3001647: {
                    if (name.equals("aqhg")) {
                        n2 = 21;
                        break Label_1426;
                    }
                    break;
                }
                case 3001632: {
                    if (name.equals("aqgw")) {
                        n2 = 13;
                        break Label_1426;
                    }
                    break;
                }
                case 3001626: {
                    if (name.equals("aqgq")) {
                        n2 = 12;
                        break Label_1426;
                    }
                    break;
                }
                case 3001623: {
                    if (name.equals("aqgn")) {
                        n2 = 20;
                        break Label_1426;
                    }
                    break;
                }
                case 3001619: {
                    if (name.equals("aqgj")) {
                        n2 = 22;
                        break Label_1426;
                    }
                    break;
                }
                case 3001611: {
                    if (name.equals("aqgb")) {
                        n2 = 31;
                        break Label_1426;
                    }
                    break;
                }
                case 3001590: {
                    if (name.equals("aqfl")) {
                        n2 = 38;
                        break Label_1426;
                    }
                    break;
                }
                case 3001585: {
                    if (name.equals("aqfg")) {
                        n2 = 16;
                        break Label_1426;
                    }
                    break;
                }
                case 3001581: {
                    if (name.equals("aqfc")) {
                        n2 = 17;
                        break Label_1426;
                    }
                    break;
                }
                case 3001504: {
                    if (name.equals("aqcs")) {
                        n2 = 4;
                        break Label_1426;
                    }
                    break;
                }
                case 3001437: {
                    if (name.equals("aqan")) {
                        n2 = 60;
                        break Label_1426;
                    }
                    break;
                }
                case 3001428: {
                    if (name.equals("aqae")) {
                        n2 = 5;
                        break Label_1426;
                    }
                    break;
                }
                case 3001196: {
                    if (name.equals("apxu")) {
                        n2 = 52;
                        break Label_1426;
                    }
                    break;
                }
                case 3001007: {
                    if (name.equals("aprr")) {
                        n2 = 46;
                        break Label_1426;
                    }
                    break;
                }
                case 3000982: {
                    if (name.equals("apqx")) {
                        n2 = 47;
                        break Label_1426;
                    }
                    break;
                }
                case 3000938: {
                    if (name.equals("appk")) {
                        n2 = 29;
                        break Label_1426;
                    }
                    break;
                }
                case 2999928: {
                    if (name.equals("aonx")) {
                        n2 = 51;
                        break Label_1426;
                    }
                    break;
                }
                case 2999767: {
                    if (name.equals("aoir")) {
                        n2 = 41;
                        break Label_1426;
                    }
                    break;
                }
                case 2999755: {
                    if (name.equals("aoif")) {
                        n2 = 40;
                        break Label_1426;
                    }
                    break;
                }
                case 2999259: {
                    if (name.equals("anxf")) {
                        n2 = 44;
                        break Label_1426;
                    }
                    break;
                }
                case 2999182: {
                    if (name.equals("anuv")) {
                        n2 = 0;
                        break Label_1426;
                    }
                    break;
                }
                case 2999181: {
                    if (name.equals("anuu")) {
                        n2 = 6;
                        break Label_1426;
                    }
                    break;
                }
                case 2999114: {
                    if (name.equals("ansp")) {
                        n2 = 28;
                        break Label_1426;
                    }
                    break;
                }
                case 2998966: {
                    if (name.equals("annw")) {
                        n2 = 43;
                        break Label_1426;
                    }
                    break;
                }
                case 2998870: {
                    if (name.equals("ankt")) {
                        n2 = 27;
                        break Label_1426;
                    }
                    break;
                }
                case 2998209: {
                    if (name.equals("amuj")) {
                        n2 = 30;
                        break Label_1426;
                    }
                    break;
                }
                case 2998151: {
                    if (name.equals("amsn")) {
                        n2 = 55;
                        break Label_1426;
                    }
                    break;
                }
                case 2997301: {
                    if (name.equals("alwa")) {
                        n2 = 34;
                        break Label_1426;
                    }
                    break;
                }
                case 2997053: {
                    if (name.equals("aloa")) {
                        n2 = 39;
                        break Label_1426;
                    }
                    break;
                }
                case 2995725: {
                    if (name.equals("akcf")) {
                        n2 = 48;
                        break Label_1426;
                    }
                    break;
                }
                case 2995362: {
                    if (name.equals("ajvo")) {
                        n2 = 32;
                        break Label_1426;
                    }
                    break;
                }
                case 2995338: {
                    if (name.equals("ajuv")) {
                        n2 = 9;
                        break Label_1426;
                    }
                    break;
                }
                case 2995265: {
                    if (name.equals("ajsk")) {
                        n2 = 58;
                        break Label_1426;
                    }
                    break;
                }
                case 2995197: {
                    if (name.equals("ajqe")) {
                        n2 = 8;
                        break Label_1426;
                    }
                    break;
                }
                case 2995094: {
                    if (name.equals("ajmz")) {
                        n2 = 33;
                        break Label_1426;
                    }
                    break;
                }
                case 2995084: {
                    if (name.equals("ajmp")) {
                        n2 = 25;
                        break Label_1426;
                    }
                    break;
                }
                case 2995083: {
                    if (name.equals("ajmo")) {
                        n2 = 23;
                        break Label_1426;
                    }
                    break;
                }
                case 2994933: {
                    if (name.equals("ajht")) {
                        n2 = 42;
                        break Label_1426;
                    }
                    break;
                }
                case 2994486: {
                    if (name.equals("aiyg")) {
                        n2 = 2;
                        break Label_1426;
                    }
                    break;
                }
                case 2994242: {
                    if (name.equals("aiqk")) {
                        n2 = 3;
                        break Label_1426;
                    }
                    break;
                }
                case 2994241: {
                    if (name.equals("aiqj")) {
                        n2 = 7;
                        break Label_1426;
                    }
                    break;
                }
                case 2993984: {
                    if (name.equals("aiia")) {
                        n2 = 45;
                        break Label_1426;
                    }
                    break;
                }
                case 2993896: {
                    if (name.equals("aiff")) {
                        n2 = 57;
                        break Label_1426;
                    }
                    break;
                }
                case 2993823: {
                    if (name.equals("aicz")) {
                        n2 = 26;
                        break Label_1426;
                    }
                    break;
                }
                case 2993199: {
                    if (name.equals("ahnv")) {
                        n2 = 36;
                        break Label_1426;
                    }
                    break;
                }
                case 2993198: {
                    if (name.equals("ahnu")) {
                        n2 = 35;
                        break Label_1426;
                    }
                    break;
                }
                case 2993007: {
                    if (name.equals("ahhp")) {
                        n2 = 1;
                        break Label_1426;
                    }
                    break;
                }
                case 2991357: {
                    if (name.equals("afqi")) {
                        n2 = 10;
                        break Label_1426;
                    }
                    break;
                }
                case 2991337: {
                    if (name.equals("afpt")) {
                        n2 = 59;
                        break Label_1426;
                    }
                    break;
                }
                case 110769: {
                    if (name.equals("pbc")) {
                        n2 = 49;
                        break Label_1426;
                    }
                    break;
                }
                case 110768: {
                    if (name.equals("pbb")) {
                        n2 = 50;
                        break Label_1426;
                    }
                    break;
                }
                case 109797: {
                    if (name.equals("oaw")) {
                        n2 = 54;
                        break Label_1426;
                    }
                    break;
                }
                case -1542839146: {
                    if (name.equals("com.google.protos.youtube.elements.TransactionContextOuterClass$TransactionContext")) {
                        n2 = 37;
                        break Label_1426;
                    }
                    break;
                }
            }
            n2 = -1;
        }
        switch (n2) {
            default: {
                return null;
            }
            case 60: {
                if (n != 1000) {
                    return null;
                }
                return aqak.b;
            }
            case 59: {
                if (n == 118) {
                    return afqe.b;
                }
                if (n != 126) {
                    return null;
                }
                return afpy.b;
            }
            case 58: {
                if (n != 188907957) {
                    return null;
                }
                return ajsg.b;
            }
            case 57: {
                if (n == 146730964) {
                    return aifd.b;
                }
                if (n == 147492108) {
                    return aifd.c;
                }
                if (n != 154861719) {
                    return null;
                }
                return aifd.d;
            }
            case 56: {
                if (n != 392045369) {
                    return null;
                }
                return ahfr.b;
            }
            case 55: {
                if (n != 1000) {
                    return null;
                }
                return amsm.b;
            }
            case 54: {
                if (n == 241004531) {
                    return obh.a;
                }
                if (n != 274929758) {
                    return null;
                }
                return obf.a;
            }
            case 53: {
                if (n != 9) {
                    return null;
                }
                return aofx.b;
            }
            case 52: {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 1002: {
                        return apxv.d;
                    }
                    case 1001: {
                        return apxv.c;
                    }
                    case 1000: {
                        return apxv.b;
                    }
                }
                break;
            }
            case 51: {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 343899489: {
                        return aonu.b;
                    }
                    case 322606150: {
                        return aont.b;
                    }
                    case 272544428: {
                        return aonw.b;
                    }
                    case 259636353: {
                        return aons.b;
                    }
                }
                break;
            }
            case 50: {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 100000003: {
                        return pcw.b;
                    }
                    case 100000002: {
                        return pbx.c;
                    }
                    case 100000001: {
                        return pbx.b;
                    }
                }
                break;
            }
            case 49: {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 200000034: {
                        return quh.a;
                    }
                    case 200000028: {
                        return pcw.a;
                    }
                    case 200000013: {
                        return pbx.a;
                    }
                    case 100000018: {
                        return pcz.a;
                    }
                    case 100000017: {
                        return pcl.a;
                    }
                    case 100000016: {
                        return pdn.a;
                    }
                    case 100000015: {
                        return pdp.a;
                    }
                    case 100000013: {
                        return pcx.b;
                    }
                    case 100000007: {
                        return pcx.a;
                    }
                    case 100000005: {
                        return pdf.a;
                    }
                    case 100000004: {
                        return pbk.a;
                    }
                }
                break;
            }
            case 48: {
                if (n == 177622921) {
                    return akcb.b;
                }
                if (n != 274703452) {
                    return null;
                }
                return akcb.c;
            }
            case 47: {
                if (n == 162000138) {
                    return apql.c;
                }
                if (n != 162410900) {
                    return null;
                }
                return apql.b;
            }
            case 46: {
                if (n == 153514762) {
                    return apqm.b;
                }
                if (n != 167027722) {
                    return null;
                }
                return apqm.c;
            }
            case 45: {
                if (n != 123258328) {
                    return null;
                }
                return aihy.b;
            }
            case 44: {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 475416448: {
                        return anxe.f;
                    }
                    case 338678567: {
                        return anxe.e;
                    }
                    case 320664538: {
                        return anxe.d;
                    }
                    case 308140915: {
                        return anxe.c;
                    }
                    case 307091372: {
                        return anxe.b;
                    }
                }
                break;
            }
            case 43: {
                if (n != 1000) {
                    return null;
                }
                return aqjk.b;
            }
            case 42: {
                if (n != 379568079) {
                    return null;
                }
                return ajiw.b;
            }
            case 41: {
                if (n != 239610506) {
                    return null;
                }
                return aoil.b;
            }
            case 40: {
                if (n == 127992852) {
                    return aohx.c;
                }
                if (n != 128093714) {
                    return null;
                }
                return aohx.b;
            }
            case 39: {
                if (n == 116390062) {
                    return alnz.c;
                }
                if (n != 116410864) {
                    return null;
                }
                return alnz.b;
            }
            case 38: {
                if (n != 351816584) {
                    return null;
                }
                return aqje.b;
            }
            case 37: {
                if (n != 1000) {
                    return null;
                }
                return aqpa.b;
            }
            case 36: {
                if (n != 120958174) {
                    return null;
                }
                return aohn.b;
            }
            case 35: {
                if (n != 120958174) {
                    return null;
                }
                return ahuy.b;
            }
            case 34: {
                if (n != 999) {
                    return null;
                }
                return alvz.a;
            }
            case 33: {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 413030470: {
                        return anmw.b;
                    }
                    case 328964737: {
                        return anvp.b;
                    }
                    case 273577170: {
                        return alko.b;
                    }
                    case 196886555: {
                        return aorz.b;
                    }
                }
                break;
            }
            case 32: {
                if (n == 1) {
                    return ajpw.b;
                }
                if (n == 2) {
                    return ajna.b;
                }
                if (n != 3) {
                    return null;
                }
                return aorv.b;
            }
            case 31: {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 356511053: {
                        return alvo.b;
                    }
                    case 346458203: {
                        return ajxv.b;
                    }
                    case 346458202: {
                        return ajxr.b;
                    }
                }
                break;
            }
            case 30: {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 440426161: {
                        return amaj.b;
                    }
                    case 407110990: {
                        return apyu.b;
                    }
                    case 403433066: {
                        return alzg.b;
                    }
                    case 398807183: {
                        return antz.b;
                    }
                    case 396373871: {
                        return amao.b;
                    }
                    case 330586086: {
                        return aowx.b;
                    }
                    case 318835310: {
                        return aluz.b;
                    }
                    case 301414196: {
                        return apzh.b;
                    }
                    case 299918355: {
                        return apyp.b;
                    }
                    case 288486286: {
                        return ajjr.b;
                    }
                    case 230806702: {
                        return ancv.b;
                    }
                }
                break;
            }
            case 29: {
                if (n == 337527695) {
                    return ajic.b;
                }
                if (n != 393415810) {
                    return null;
                }
                return ajgz.b;
            }
            case 28: {
                if (n != 400250658) {
                    return null;
                }
                return ansn.b;
            }
            case 27: {
                if (n != 125983101) {
                    return null;
                }
                return ankq.b;
            }
            case 26: {
                if (n == 160206468) {
                    return aicx.b;
                }
                if (n != 388817581) {
                    return null;
                }
                return aise.b;
            }
            case 25: {
                if (n == 259430334) {
                    return ajmn.b;
                }
                if (n == 346823646) {
                    return anls.b;
                }
                if (n != 396644439) {
                    return null;
                }
                return amgi.b;
            }
            case 24: {
                if (n != 6) {
                    return null;
                }
                return atxo.b;
            }
            case 23: {
                if (n == 172660663) {
                    return aqaa.a;
                }
                if (n != 465100242) {
                    return null;
                }
                return ailw.a;
            }
            case 22: {
                if (n == 280276962) {
                    return aqgu.b;
                }
                if (n != 339295757) {
                    return null;
                }
                return ajhb.b;
            }
            case 21: {
                if (n == 188911708) {
                    return aqgz.b;
                }
                if (n != 307697168) {
                    return null;
                }
                return aovu.b;
            }
            case 20: {
                if (n != 424548931) {
                    return null;
                }
                return ajvx.b;
            }
            case 19: {
                if (n == 169768054) {
                    return aqfv.b;
                }
                if (n != 172035250) {
                    return null;
                }
                return aqhn.b;
            }
            case 18: {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 476972423: {
                        return aoxh.b;
                    }
                    case 473072685: {
                        return annu.b;
                    }
                    case 468649401: {
                        return apjj.b;
                    }
                    case 466908575: {
                        return apfz.b;
                    }
                    case 455760676: {
                        return aqlc.b;
                    }
                    case 455760642: {
                        return aqla.b;
                    }
                    case 455760581: {
                        return aqkv.b;
                    }
                    case 445532692: {
                        return aqno.b;
                    }
                    case 438334080: {
                        return anzf.b;
                    }
                    case 432983888: {
                        return aqnq.b;
                    }
                    case 432746749: {
                        return apfv.b;
                    }
                    case 428067722: {
                        return aqhb.b;
                    }
                    case 427304386: {
                        return ajeu.b;
                    }
                    case 427222820: {
                        return aofz.b;
                    }
                    case 421321174: {
                        return ajxi.b;
                    }
                    case 410903799: {
                        return ajjq.b;
                    }
                    case 409926433: {
                        return ajyb.b;
                    }
                    case 406356192: {
                        return annv.b;
                    }
                    case 406356191: {
                        return annz.b;
                    }
                    case 398019128: {
                        return aikq.b;
                    }
                    case 397977602: {
                        return aiio.b;
                    }
                    case 394017097: {
                        return ajqu.b;
                    }
                    case 388804096: {
                        return aolc.b;
                    }
                    case 387215479: {
                        return ahoy.b;
                    }
                    case 383499401: {
                        return apgh.b;
                    }
                    case 382524576: {
                        return apga.b;
                    }
                    case 375538462: {
                        return alvr.b;
                    }
                    case 370527389: {
                        return ahoi.b;
                    }
                    case 368511790: {
                        return aosc.b;
                    }
                    case 363503224: {
                        return aqnl.b;
                    }
                    case 360463768: {
                        return aqkt.b;
                    }
                    case 359752495: {
                        return apfy.b;
                    }
                    case 352829283: {
                        return aqoc.b;
                    }
                    case 343298030: {
                        return aiws.b;
                    }
                    case 342268478: {
                        return aqfz.b;
                    }
                    case 336926123: {
                        return aqku.b;
                    }
                    case 334455667: {
                        return aqnr.b;
                    }
                    case 329240327: {
                        return aqkx.b;
                    }
                    case 325347951: {
                        return aqgt.b;
                    }
                    case 315254111: {
                        return aqld.b;
                    }
                    case 315253727: {
                        return aqlb.b;
                    }
                    case 315252720: {
                        return aqkz.b;
                    }
                    case 314600826: {
                        return alvn.b;
                    }
                    case 314223858: {
                        return anoh.b;
                    }
                    case 303917309: {
                        return ahvl.b;
                    }
                    case 296054159: {
                        return aiwt.b;
                    }
                    case 290993185: {
                        return amla.b;
                    }
                    case 289177740: {
                        return amuh.b;
                    }
                    case 289084567: {
                        return aiwr.b;
                    }
                    case 285132689: {
                        return aixo.b;
                    }
                    case 281539545: {
                        return aqeo.b;
                    }
                    case 279698363: {
                        return aiwx.b;
                    }
                    case 278463287: {
                        return aqnu.b;
                    }
                    case 278341630: {
                        return aiwv.b;
                    }
                    case 273756508: {
                        return aipm.b;
                    }
                    case 262904603: {
                        return aoge.b;
                    }
                    case 260591906: {
                        return alvk.b;
                    }
                    case 250283977: {
                        return amxt.b;
                    }
                    case 249145766: {
                        return aovd.b;
                    }
                    case 241780379: {
                        return alvq.b;
                    }
                    case 234871417: {
                        return aogg.b;
                    }
                    case 234870342: {
                        return ajew.b;
                    }
                    case 230793507: {
                        return ajev.b;
                    }
                    case 228301911: {
                        return aoro.b;
                    }
                    case 228172556: {
                        return aorn.b;
                    }
                    case 225399221: {
                        return aqnm.b;
                    }
                    case 221293762: {
                        return aogl.b;
                    }
                    case 221166232: {
                        return ajex.b;
                    }
                    case 220544256: {
                        return aqnv.b;
                    }
                    case 217165905: {
                        return aqnn.b;
                    }
                    case 206634270: {
                        return ajfa.b;
                    }
                    case 206181248: {
                        return aqft.b;
                    }
                    case 202698262: {
                        return anlg.b;
                    }
                    case 197074932: {
                        return aqle.b;
                    }
                    case 194114827: {
                        return aqhi.b;
                    }
                    case 183321338: {
                        return ajeo.b;
                    }
                    case 182590845: {
                        return aqfm.b;
                    }
                    case 170382760: {
                        return aqhm.b;
                    }
                    case 170382720: {
                        return aqhd.b;
                    }
                    case 170382688: {
                        return aqhc.b;
                    }
                    case 170382656: {
                        return aqgs.b;
                    }
                    case 170382629: {
                        return aqgr.b;
                    }
                    case 169495254: {
                        return akjn.a;
                    }
                    case 167732284: {
                        return ajfe.b;
                    }
                }
                break;
            }
            case 17: {
                if (n == 188490103) {
                    return aqfe.b;
                }
                if (n != 212323971) {
                    return null;
                }
                return aqfy.b;
            }
            case 16: {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 429403481: {
                        return ajil.b;
                    }
                    case 412985095: {
                        return aqjc.b;
                    }
                    case 406207899: {
                        return aqiz.b;
                    }
                    case 400157044: {
                        return aqjv.b;
                    }
                    case 384293593: {
                        return ajho.b;
                    }
                    case 380917126: {
                        return ajhv.b;
                    }
                    case 378918909: {
                        return ajha.b;
                    }
                    case 378762193: {
                        return ajiv.b;
                    }
                    case 373468381: {
                        return ajix.b;
                    }
                    case 372486289: {
                        return ajiu.b;
                    }
                    case 372117054: {
                        return ajgc.b;
                    }
                    case 372095937: {
                        return ajfz.b;
                    }
                    case 368882815: {
                        return aqjl.b;
                    }
                    case 363458402: {
                        return aqja.b;
                    }
                    case 362363524: {
                        return ajhr.b;
                    }
                    case 361707526: {
                        return aqkd.b;
                    }
                    case 355246692: {
                        return ajgd.b;
                    }
                    case 355044355: {
                        return ajhu.b;
                    }
                    case 353892150: {
                        return ajhg.b;
                    }
                    case 323685881: {
                        return ajik.b;
                    }
                    case 314573701: {
                        return ajie.b;
                    }
                    case 297019532: {
                        return ajjh.b;
                    }
                    case 238551640: {
                        return aqji.b;
                    }
                    case 232954548: {
                        return aqkq.b;
                    }
                    case 188495463: {
                        return aqfi.b;
                    }
                }
                break;
            }
            case 15: {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 471576040: {
                        return amly.b;
                    }
                    case 363654335: {
                        return aqmr.b;
                    }
                    case 347675936: {
                        return anck.b;
                    }
                    case 323854738: {
                        return aqmp.b;
                    }
                    case 277808098: {
                        return aqgl.b;
                    }
                    case 272494533: {
                        return aqnx.b;
                    }
                    case 258602976: {
                        return aqel.b;
                    }
                    case 220721894: {
                        return aqoa.b;
                    }
                    case 217374632: {
                        return aqnp.b;
                    }
                    case 201264127: {
                        return ahkq.b;
                    }
                    case 168777401: {
                        return aqfb.b;
                    }
                    case 158796327: {
                        return aqfk.b;
                    }
                }
                break;
            }
            case 14: {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 472454357: {
                        return aqev.b;
                    }
                    case 472454038: {
                        return aqeu.b;
                    }
                    case 463642931: {
                        return aqet.b;
                    }
                    case 461985397: {
                        return aqew.b;
                    }
                    case 455760611: {
                        return aqkw.b;
                    }
                    case 455145426: {
                        return aqes.b;
                    }
                    case 449848976: {
                        return aqfs.b;
                    }
                    case 409052762: {
                        return aqey.b;
                    }
                    case 405866343: {
                        return aqmq.b;
                    }
                    case 272531091: {
                        return aqnw.b;
                    }
                    case 220721894: {
                        return aqnz.b;
                    }
                    case 198239242: {
                        return aqen.b;
                    }
                    case 196573526: {
                        return aqdq.b;
                    }
                    case 194116769: {
                        return aqfu.b;
                    }
                    case 193804845: {
                        return aqha.b;
                    }
                }
                break;
            }
            case 13: {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 402418170: {
                        return DirectUpdatePropertiesOuterClass$DirectUpdateProperties.b;
                    }
                    case 305711371: {
                        return anwi.b;
                    }
                    case 284051629: {
                        return aqlg.b;
                    }
                    case 255496645: {
                        return aqgq.b;
                    }
                    case 200077771: {
                        return aqhe.b;
                    }
                    case 169494678: {
                        return alwa.b;
                    }
                }
                break;
            }
            case 12: {
                if (n != 252911519) {
                    return null;
                }
                return apvz.b;
            }
            case 11: {
                if (n != 3) {
                    return null;
                }
                return aqgm.b;
            }
            case 10: {
                if (n == 508) {
                    return afqa.a;
                }
                if (n == 549) {
                    return agsj.b;
                }
                if (n == 571) {
                    return afqg.b;
                }
                if (n == 618) {
                    return afpy.a;
                }
                if (n != 772) {
                    return null;
                }
                return afps.b;
            }
            case 9: {
                if (n != 152040444) {
                    return null;
                }
                return ajoi.b;
            }
            case 8: {
                if (n == 119) {
                    return ancz.b;
                }
                if (n == 120) {
                    return aoxd.b;
                }
                if (n == 136) {
                    return amae.b;
                }
                if (n == 137) {
                    return alzy.b;
                }
                if (n == 141) {
                    return ajgr.b;
                }
                if (n == 142) {
                    return amsa.b;
                }
                if (n == 146) {
                    return ajjy.b;
                }
                if (n == 147) {
                    return alzb.b;
                }
                if (n == 198) {
                    return amwm.b;
                }
                if (n == 199) {
                    return ajii.b;
                }
                if (n == 261) {
                    return amas.b;
                }
                if (n == 262) {
                    return aman.b;
                }
                if (n == 290) {
                    return anli.b;
                }
                if (n == 291) {
                    return apyg.b;
                }
                if (n == 379) {
                    return akfm.b;
                }
                if (n == 380) {
                    return akfq.b;
                }
                switch (n) {
                    default: {
                        switch (n) {
                            default: {
                                return null;
                            }
                            case 156: {
                                return apyo.b;
                            }
                            case 155: {
                                return apyt.b;
                            }
                            case 154: {
                                return apyz.b;
                            }
                            case 153: {
                                return apzg.b;
                            }
                            case 152: {
                                return apyk.b;
                            }
                            case 151: {
                                return apzn.b;
                            }
                        }
                        break;
                    }
                    case 413: {
                        return apsz.b;
                    }
                    case 373: {
                        return alzf.b;
                    }
                    case 368: {
                        return alzq.b;
                    }
                    case 364: {
                        return ahvq.b;
                    }
                    case 349: {
                        return ajsc.b;
                    }
                    case 344: {
                        return aner.b;
                    }
                    case 335: {
                        return apjh.b;
                    }
                    case 328: {
                        return anfh.b;
                    }
                    case 326: {
                        return anhq.b;
                    }
                    case 323: {
                        return anhi.b;
                    }
                    case 312: {
                        return amcb.b;
                    }
                    case 306: {
                        return alzl.b;
                    }
                    case 303: {
                        return ajch.b;
                    }
                    case 301: {
                        return ajit.b;
                    }
                    case 299: {
                        return ajip.b;
                    }
                    case 284: {
                        return ajgy.b;
                    }
                    case 264: {
                        return ajjl.b;
                    }
                    case 256: {
                        return aonq.b;
                    }
                    case 244: {
                        return ajjb.b;
                    }
                    case 230: {
                        return antt.b;
                    }
                    case 224: {
                        return ajhf.b;
                    }
                    case 220: {
                        return airi.b;
                    }
                    case 218: {
                        return aigh.b;
                    }
                    case 215: {
                        return aira.b;
                    }
                    case 201: {
                        return apik.b;
                    }
                    case 196: {
                        return ambu.b;
                    }
                    case 192: {
                        return ajib.b;
                    }
                    case 179: {
                        return ahmd.b;
                    }
                    case 173: {
                        return ajjf.b;
                    }
                    case 167: {
                        return ahni.b;
                    }
                    case 164: {
                        return alyv.b;
                    }
                    case 158: {
                        return alyp.b;
                    }
                    case 130: {
                        return amwc.b;
                    }
                    case 76: {
                        return apnq.b;
                    }
                    case 39: {
                        return amwi.b;
                    }
                }
                break;
            }
            case 7: {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 482335653: {
                        return DismissSuggestedActionCommandOuterClass$DismissSuggestedActionCommand.dismissSuggestedActionCommand;
                    }
                    case 477657426: {
                        return anmu.b;
                    }
                    case 475576971: {
                        return CreationSuggestionDismissCommandOuterClass$CreationSuggestionDismissCommand.creationSuggestionDismissCommand;
                    }
                    case 471876474: {
                        return aluy.b;
                    }
                    case 471082452: {
                        return QueueAwarePlaylistWatchCommandOuterClass$QueueAwarePlaylistWatchCommand.queueAwarePlaylistWatchCommand;
                    }
                    case 471068492: {
                        return aokl.b;
                    }
                    case 471068491: {
                        return aief.b;
                    }
                    case 470342095: {
                        return UpdateTimedCommentsPlaybackCommandOuterClass$UpdateTimedCommentsPlaybackCommand.updateTimedCommentsPlaybackCommand;
                    }
                    case 469942096: {
                        return QueueAddMenuItemCommandOuterClass$QueueAddMenuItemCommand.queueAddMenuItemCommand;
                    }
                    case 469660771: {
                        return WatchPlayerOverflowMenuCommandOuterClass$WatchPlayerOverflowMenuCommand.watchPlayerOverflowMenuCommand;
                    }
                    case 465666947: {
                        return GetWatchNextQueueAddCommandOuterClass$GetWatchNextQueueAddCommand.getWatchNextQueueAddCommand;
                    }
                    case 463626877: {
                        return WebViewActionCommandOuterClass$WebViewActionCommand.webViewActionCommand;
                    }
                    case 463456146: {
                        return ClearLocationCommandOuterClass$ClearLocationCommand.clearLocationCommand;
                    }
                    case 463152755: {
                        return LiveChatRemoveChatItemByAuthorAction$RemoveChatItemByAuthorAction.removeChatItemByAuthorAction;
                    }
                    case 462702848: {
                        return CoWatchWatchEndpointWrapperCommandOuterClass$CoWatchWatchEndpointWrapperCommand.coWatchWatchEndpointWrapperCommand;
                    }
                    case 456628506: {
                        return DisableCinematicLightingCommandOuterClass$DisableCinematicLightingCommand.disableCinematicLightingCommand;
                    }
                    case 456628505: {
                        return EnableCinematicLightingCommandOuterClass$EnableCinematicLightingCommand.enableCinematicLightingCommand;
                    }
                    case 455257696: {
                        return SaveToPlaylistListEntityUpdateCommandOuterClass$SaveToPlaylistListEntityUpdateCommand.saveToPlaylistListEntityUpdateCommand;
                    }
                    case 453651355: {
                        return aofc.b;
                    }
                    case 452396615: {
                        return ReloadLiveChatCommandOuterClass.reloadLiveChatCommand;
                    }
                    case 448363122: {
                        return akbd.b;
                    }
                    case 448353930: {
                        return aoft.b;
                    }
                    case 445684868: {
                        return ExecuteEntityCommandOuterClass$ExecuteEntityCommand.executeEntityCommand;
                    }
                    case 444949225: {
                        return AssetItemDeselectCommandOuterClass$AssetItemDeselectCommand.assetItemDeselectCommand;
                    }
                    case 444451292: {
                        return CoWatchCommandOuterClass$CoWatchCommand.coWatchCommand;
                    }
                    case 443723397: {
                        return ApplyCoWatchActionCommandOuterClass$ApplyCoWatchActionCommand.applyCoWatchActionCommand;
                    }
                    case 443434441: {
                        return ShowSheetCommandOuterClass$ShowSheetCommand.showSheetCommand;
                    }
                    case 441221881: {
                        return ShowMoreDrawerCommandOuterClass$ShowMoreDrawerCommand.showMoreDrawerCommand;
                    }
                    case 439964451: {
                        return OpenWaitingRoomCommandOuterClass$OpenWaitingRoomCommand.openWaitingRoomCommand;
                    }
                    case 439221000: {
                        return KickOtherParticipantCommandOuterClass$KickOtherParticipantCommand.kickOtherParticipantCommand;
                    }
                    case 437088376: {
                        return AssetItemSelectCommandOuterClass$AssetItemSelectCommand.assetItemSelectCommand;
                    }
                    case 436105077: {
                        return CloseCostreamInviteScreenCommandOuterClass$CloseCostreamInviteScreenCommand.closeCostreamInviteScreenCommand;
                    }
                    case 432996255: {
                        return ajag.b;
                    }
                    case 432944950: {
                        return PlayBillingCrossSellCommandOuterClass$PlayBillingCrossSellCommand.playBillingCrossSellCommand;
                    }
                    case 432546775: {
                        return OpenMyGooglePageCommandOuterClass$OpenMyGooglePageCommand.openMyGooglePageCommand;
                    }
                    case 430167970: {
                        return LiveChatAction$ClearChatWindowAction.clearChatWindowAction;
                    }
                    case 428788994: {
                        return amxu.b;
                    }
                    case 427587276: {
                        return LogYpcFlowFailureCommandOuterClass$LogYpcFlowFailureCommand.logYpcFlowFailureCommand;
                    }
                    case 421169157: {
                        return ResetConferenceInviteUrlCommand.resetConferenceInviteUrlCommand;
                    }
                    case 420369855: {
                        return PollGetBroadcastConferenceCommandOuterClass.pollGetBroadcastConferenceCommand;
                    }
                    case 413219504: {
                        return AddIapBannerToLiveChatCommandOuterClass$AddIapBannerToLiveChatCommand.addIapBannerToLiveChatCommand;
                    }
                    case 412940936: {
                        return RepeatChapterCommandOuterClass$RepeatChapterCommand.repeatChapterCommand;
                    }
                    case 412156452: {
                        return DynamicFlowCommandOuterClass$DynamicFlowCommand.dynamicFlowCommand;
                    }
                    case 410400906: {
                        return aogd.b;
                    }
                    case 410389781: {
                        return ShortsCreationVideoIngestionCommandOuterClass$ShortsCreationVideoIngestionCommand.shortsCreationVideoIngestionCommand;
                    }
                    case 410014803: {
                        return UpdateLatestEventCreationTimestampCommandOuterClass$UpdateLatestEventCreationTimestampCommand.updateLatestEventCreationTimestampCommand;
                    }
                    case 408748412: {
                        return ShowTransientPlayerScrimOverlayCommandOuterClass$ShowTransientPlayerScrimOverlayCommand.showTransientPlayerScrimOverlayCommand;
                    }
                    case 408721390: {
                        return FlowPrevStepCommandOuterClass$FlowPrevStepCommand.flowPrevStepCommand;
                    }
                    case 408684665: {
                        return anso.b;
                    }
                    case 407683780: {
                        return LoadMarkersCommandOuterClass$LoadMarkersCommand.loadMarkersCommand;
                    }
                    case 407654001: {
                        return DecorateMessageEndpointOuterClass$DecorateMessageEndpoint.decorateMessageEndpoint;
                    }
                    case 407180959: {
                        return AdInfraSupportWrapperCommandOuterClass$AdInfraSupportWrapperCommand.adInfraSupportWrapperCommand;
                    }
                    case 404019588: {
                        return PivotBarNavigationCommandOuterClass$PivotBarNavigationCommand.pivotBarNavigationCommand;
                    }
                    case 401875543: {
                        return ShareImageCommandOuterClass$ShareImageCommand.shareImageCommand;
                    }
                    case 401367808: {
                        return DisableBeforeFocusCommandOuterClass.disableBeforeFocusCommand;
                    }
                    case 399887779: {
                        return LiveChatQnaActionEndpointOuterClass$LiveChatQnaActionEndpoint.liveChatQnaActionEndpoint;
                    }
                    case 398472935: {
                        return ShowMessageInputPromptCommandOuterClass.showMessageInputPromptCommand;
                    }
                    case 398047497: {
                        return akbe.b;
                    }
                    case 396717750: {
                        return ajez.b;
                    }
                    case 395993086: {
                        return UpdatePlayerErrorMessageCommandOuterClass$UpdatePlayerErrorMessageCommand.updatePlayerErrorMessageCommand;
                    }
                    case 395519548: {
                        return LocationCollectionCommandOuterClass$LocationCollectionCommand.locationCollectionCommand;
                    }
                    case 394709859: {
                        return ReelNonVideoContentEndpointOuterClass$ReelNonVideoContentEndpoint.reelNonVideoContentEndpoint;
                    }
                    case 394311467: {
                        return ResolveLocationCommandOuterClass$ResolveLocationCommand.resolveLocationCommand;
                    }
                    case 393898374: {
                        return AddGoogleAccountCommandOuterClass$AddGoogleAccountCommand.addGoogleAccountCommand;
                    }
                    case 392792774: {
                        return AddItemToLiveChatTeaserCommandOuterClass$AddItemToLiveChatTeaserCommand.addItemToChatTeaserCommand;
                    }
                    case 392585764: {
                        return ShowFullscreenEngagementOverlayCommandOuterClass$ShowFullscreenEngagementOverlayCommand.showFullscreenEngagementOverlayCommand;
                    }
                    case 392023517: {
                        return LogAdVisualElementNoOpClickCommandOuterClass$LogAdVisualElementNoOpClickCommand.logAdVisualElementNoOpClickCommand;
                    }
                    case 388636837: {
                        return ajey.b;
                    }
                    case 387863284: {
                        return UpdateShareSheetCommandOuterClass$UpdateShareSheetCommand.updateShareSheetCommand;
                    }
                    case 387380578: {
                        return aogn.b;
                    }
                    case 387205844: {
                        return PrefetchWatchCommandOuterClass$PrefetchWatchCommand.prefetchWatchCommand;
                    }
                    case 386457349: {
                        return WebviewAuthCommand$WebViewAuthCommand.webViewAuthCommand;
                    }
                    case 384712612: {
                        return ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand.changeMarkersVisibilityCommand;
                    }
                    case 382489859: {
                        return ajqt.b;
                    }
                    case 382320942: {
                        return GetDownloadActionCommandOuterClass$GetDownloadActionCommand.getDownloadActionCommand;
                    }
                    case 381321562: {
                        return PlayBillingCommandOuterClass$PlayBillingCommand.playBillingCommand;
                    }
                    case 381200336: {
                        return aoum.a;
                    }
                    case 380210655: {
                        return RefreshPanelEndpointOuterClass$RefreshPanelEndpoint.refreshPanelEndpoint;
                    }
                    case 378640040: {
                        return ChannelPageContinuationCommandOuterClass$ChannelPageContinuationCommand.channelPageContinuationCommand;
                    }
                    case 378557652: {
                        return EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.editSubscriptionsCollectionCommand;
                    }
                    case 378557648: {
                        return CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand.createSubscriptionsCollectionCommand;
                    }
                    case 377621461: {
                        return RegisterTasksCommandOuterClass$RegisterTasksCommand.registerTasksCommand;
                    }
                    case 377377894: {
                        return StoriesShareCommandOuterClass$StoriesShareCommand.storiesShareCommand;
                    }
                    case 377332428: {
                        return SharingProviderDataCommandOuterClass$SharingProviderDataCommand.sharingProviderDataCommand;
                    }
                    case 377026399: {
                        return anao.b;
                    }
                    case 377026217: {
                        return anan.b;
                    }
                    case 376981509: {
                        return aoey.b;
                    }
                    case 376887195: {
                        return anam.b;
                    }
                    case 376871121: {
                        return UpdateTimedMarkersSyncObserverCommandOuterClass$UpdateTimedMarkersSyncObserverCommand.updateTimedMarkersSyncObserverCommand;
                    }
                    case 375135162: {
                        return PrependNewerCommentsCommandOuterClass$PrependNewerCommentsCommand.prependNewerCommentsCommand;
                    }
                    case 373184421: {
                        return aowi.a;
                    }
                    case 373014159: {
                        return DismissBrowseElementsBottomSheetCommandOuterClass$DismissBrowseElementsBottomSheetCommand.dismissBrowseElementsBottomSheetCommand;
                    }
                    case 372633595: {
                        return ShowBrowseElementsBottomSheetCommandOuterClass$ShowBrowseElementsBottomSheetCommand.showBrowseElementsBottomSheetCommand;
                    }
                    case 371825304: {
                        return UpdateFlowCommandOuterClass$UpdateFlowCommand.updateFlowCommand;
                    }
                    case 371825303: {
                        return GetFlowCommandOuterClass$GetFlowCommand.getFlowCommand;
                    }
                    case 370504584: {
                        return ajxy.a;
                    }
                    case 370101185: {
                        return ShowAccountLinkDialogFromDeepLinkCommandOuterClass$ShowAccountLinkDialogFromDeepLinkCommand.showAccountLinkDialogFromDeepLinkCommand;
                    }
                    case 369951587: {
                        return ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.toggleEngagementPanelCommand;
                    }
                    case 369262379: {
                        return ShowPostCreationDialogFooterCommandOuterClass$ShowPostCreationDialogFooterCommand.showPostCreationDialogFooterCommand;
                    }
                    case 368868921: {
                        return NavigateBackCommandOuterClass$NavigateBackCommand.navigateBackCommand;
                    }
                    case 368549163: {
                        return DismissPostCreationDialogFooterCommandOuterClass$DismissPostCreationDialogFooterCommand.dismissPostCreationDialogFooterCommand;
                    }
                    case 366527935: {
                        return AboutThisAdEndpointOuterClass$AboutThisAdEndpoint.aboutThisAdEndpoint;
                    }
                    case 365619327: {
                        return aogq.b;
                    }
                    case 363015281: {
                        return LeaveBroadcastCommandOuterClass.leaveBroadcastCommand;
                    }
                    case 362581600: {
                        return SetAdsPlayerFullscreenStateCommandOuterClass$SetAdsPlayerFullscreenStateCommand.setAdsPlayerFullscreenStateCommand;
                    }
                    case 362185493: {
                        return FilterBarContentInsertionCommandOuterClass$FilterBarContentInsertionCommand.filterBarContentInsertionCommand;
                    }
                    case 360957529: {
                        return CloseStreamEndScreenCommandOuterClass.closeStreamEndScreenCommand;
                    }
                    case 359870813: {
                        return GetShortsSourceVideoCommandOuterClass$GetShortsSourceVideoCommand.getShortsSourceVideoCommand;
                    }
                    case 359423883: {
                        return DisableSingleVideoPlaybackLoopCommandOuterClass$DisableSingleVideoPlaybackLoopCommand.disableSingleVideoPlaybackLoopCommand;
                    }
                    case 359423882: {
                        return EnableSingleVideoPlaybackLoopCommandOuterClass$EnableSingleVideoPlaybackLoopCommand.enableSingleVideoPlaybackLoopCommand;
                    }
                    case 358889020: {
                        return LogAdClickTerminationCommandOuterClass$LogAdClickTerminationCommand.logAdClickTerminationCommand;
                    }
                    case 358044308: {
                        return DeleteClipEngagementPanelCommandOuterClass$DeleteClipEngagementPanelCommand.deleteClipEngagementPanelCommand;
                    }
                    case 356868596: {
                        return amxv.b;
                    }
                    case 355559704: {
                        return aolf.b;
                    }
                    case 355549603: {
                        return aolk.b;
                    }
                    case 355248151: {
                        return FilterChipTransformCommandOuterClass$FilterChipTransformCommand.filterChipTransformCommand;
                    }
                    case 354960961: {
                        return CommerceActionCommandOuterClass$CommerceActionCommand.commerceActionCommand;
                    }
                    case 354181190: {
                        return AutoconnectEndpointOuterClass$AutoconnectEndpoint.autoconnectEndpoint;
                    }
                    case 354135686: {
                        return SectionReloadCommandOuterClass$SectionReloadCommand.sectionReloadCommand;
                    }
                    case 353172822: {
                        return SfvSuggestFillCommandOuterClass$SfvSuggestFillCommand.sfvSuggestFillCommand;
                    }
                    case 350823535: {
                        return alng.b;
                    }
                    case 350496818: {
                        return AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.adsControlFlowOpportunityReceivedCommand;
                    }
                    case 348087899: {
                        return ChangeCommentsMarkersVisibilityCommandOuterClass$ChangeCommentsMarkersVisibilityCommand.changeCommentsMarkersVisibilityCommand;
                    }
                    case 348085446: {
                        return ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand.changeCommentsSortModeCommand;
                    }
                    case 346644970: {
                        return LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.logFlowLoggingEventCommand;
                    }
                    case 344144775: {
                        return SetPlayerControlsOverlayVisibilityCommandOuterClass$SetPlayerControlsOverlayVisibilityCommand.setPlayerControlsOverlayVisibilityCommand;
                    }
                    case 343591339: {
                        return AppStoreOverlayCommandOuterClass.appStoreOverlayCommand;
                    }
                    case 342632637: {
                        return UpdateKidsAllowlistCommandOuterClass.updateKidsAllowlistCommand;
                    }
                    case 340593730: {
                        return AppBrowserPrewarmAndPreconnectCommandOuterClass.appBrowserPrewarmAndPreconnectCommand;
                    }
                    case 339694216: {
                        return ShowMiniplayerCommandOuterClass$ShowMiniplayerCommand.showMiniplayerCommand;
                    }
                    case 339342808: {
                        return YpcPostTransactionReloadEndpoint$YPCPostTransactionReloadEndpoint.ypcPostTransactionReloadEndpoint;
                    }
                    case 337074424: {
                        return ShowShareWithKidsPanelCommandOuterClass.showShareWithKidsPanelCommand;
                    }
                    case 333157331: {
                        return AcknowledgeYouthereEndpointOuterClass$AcknowledgeYouthereEndpoint.acknowledgeYouthereEndpoint;
                    }
                    case 332521467: {
                        return HomeAdsPanelHideCommandOuterClass.homeAdsPanelHideCommand;
                    }
                    case 332520638: {
                        return HomeAdsPanelShowCommandOuterClass.homeAdsPanelShowCommand;
                    }
                    case 332330970: {
                        return ShowPromoCommandOuterClass$ShowPromoCommand.showPromoCommand;
                    }
                    case 330811011: {
                        return DismissDialogEndpointOuterClass$DismissDialogEndpoint.dismissDialogEndpoint;
                    }
                    case 329568813: {
                        return ChangeKeyedMarkersVisibilityCommandOuterClass$ChangeKeyedMarkersVisibilityCommand.changeKeyedMarkersVisibilityCommand;
                    }
                    case 328479972: {
                        return apft.b;
                    }
                    case 327511066: {
                        return SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.setPlaybackStateCommand;
                    }
                    case 327047410: {
                        return DismissCommentDialogEndpointOuterClass.dismissCommentDialogEndpoint;
                    }
                    case 326347078: {
                        return ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.reelWatchSurveyActionCommand;
                    }
                    case 325343688: {
                        return CreateShortFromSourceCommandOuterClass$CreateShortFromSourceCommand.createShortFromSourceCommand;
                    }
                    case 325153462: {
                        return CpidRefreshCommandOuterClass.cpidRefreshCommand;
                    }
                    case 324622913: {
                        return ShowSfvElementsBottomSheetCommand$ShowSFVElementsBottomSheetCommand.showSfvElementsBottomSheetCommand;
                    }
                    case 324237090: {
                        return GetLocationCommandOuterClass$GetLocationCommand.getLocationCommand;
                    }
                    case 323826788: {
                        return DismissSfvElementsBottomSheetCommand$DismissSFVElementsBottomSheetCommand.dismissSfvElementsBottomSheetCommand;
                    }
                    case 322705903: {
                        return InAppUpdateCommandOuterClass.inAppUpdateCommand;
                    }
                    case 322638812: {
                        return AgeVerificationEndpointOuterClass$AgeVerificationEndpoint.ageVerificationEndpoint;
                    }
                    case 321865519: {
                        return SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.sfvAudioSearchCommand;
                    }
                    case 321581790: {
                        return SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.setEngagementPanelActivelyEngagingCommand;
                    }
                    case 317727750: {
                        return AdsWebsiteDeepLinkCommandOuterClass.adsWebsiteDeepLinkCommand;
                    }
                    case 316544609: {
                        return LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.logAccountLinkingEventCommand;
                    }
                    case 315539358: {
                        return CommentUserFeedbackEndpointOuterClass.commentUserFeedbackEndpoint;
                    }
                    case 313660028: {
                        return SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.sfvAudioItemSelectCommand;
                    }
                    case 312722532: {
                        return SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.sfvAudioItemPlaybackCommand;
                    }
                    case 311688876: {
                        return EditChannelAvatarEndpointOuterClass$EditChannelAvatarEndpoint.editChannelAvatarEndpoint;
                    }
                    case 310408312: {
                        return AdsClickWrapperCommandOuterClass$AdsClickWrapperCommand.adsClickWrapperCommand;
                    }
                    case 308059427: {
                        return TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand.triggerOfferAdsEnrollmentEventCommand;
                    }
                    case 307501822: {
                        return ReplaceItemSectionHeaderActionOuterClass.replaceItemSectionHeaderAction;
                    }
                    case 307460408: {
                        return ShortsCreationEndpointOuterClass$ShortsCreationEndpoint.shortsCreationEndpoint;
                    }
                    case 305346638: {
                        return AddRendererToItemSectionActionOuterClass.addRendererToItemSectionAction;
                    }
                    case 305286116: {
                        return RemoveRendererFromItemSectionActionOuterClass.removeRendererFromItemSectionAction;
                    }
                    case 304505358: {
                        return ajyc.b;
                    }
                    case 303779213: {
                        return ManageBlockedContactsEndpointOuterClass$ManageBlockedContactsEndpoint.manageBlockedContactsEndpoint;
                    }
                    case 301715199: {
                        return PlayerToastCommandOuterClass.playerToastCommand;
                    }
                    case 301098174: {
                        return StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.startModularOnboardingCommand;
                    }
                    case 300778229: {
                        return ConnectGpgDialogCommand$ConnectGPGDialogCommand.connectGpgDialogCommand;
                    }
                    case 300761790: {
                        return CreateGpgProfileCommand$CreateGPGProfileCommand.createGpgProfileCommand;
                    }
                    case 300413109: {
                        return ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.resizeEngagementPanelToMaximizedEndpoint;
                    }
                    case 300347778: {
                        return EntityUpdateCommandOuterClass$EntityUpdateCommand.entityUpdateCommand;
                    }
                    case 300210387: {
                        return LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.logBackToAppEventCommand;
                    }
                    case 300135747: {
                        return ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.resizeEngagementPanelToFullBleedEndpoint;
                    }
                    case 291405045: {
                        return ShowPendingReelUploadsCommandOuterClass$ShowPendingReelUploadsCommand.showPendingReelUploadsCommand;
                    }
                    case 291188164: {
                        return YpcGetCancellationFlowCommand$YPCGetCancellationFlowCommand.ypcGetCancellationFlowCommand;
                    }
                    case 288176941: {
                        return MarkBelowPlayerSurveyDisplayedCommandOuterClass$MarkBelowPlayerSurveyDisplayedCommand.markBelowPlayerSurveyDisplayedCommand;
                    }
                    case 288174649: {
                        return SubmitSurveyCommandOuterClass$SubmitSurveyCommand.submitSurveyCommand;
                    }
                    case 284673439: {
                        return GetSurveyCommandOuterClass$GetSurveyCommand.getSurveyCommand;
                    }
                    case 282384239: {
                        return RotateToOptimalFullscreenOrientationCommandOuterClass$RotateToOptimalFullscreenOrientationCommand.rotateToOptimalFullscreenOrientationCommand;
                    }
                    case 278015085: {
                        return ShowSchedulingPanelCommandOuterClass.showSchedulingPanelCommand;
                    }
                    case 274848447: {
                        return LensWatchNextRequestContinuationCommandOuterClass$LensWatchNextRequestContinuationCommand.lensWatchNextRequestContinuationCommand;
                    }
                    case 272487492: {
                        return RunAttestationCommandOuterClass$RunAttestationCommand.runAttestationCommand;
                    }
                    case 267704595: {
                        return WatchNextWatchEndpointMutationCommandOuterClass$WatchNextWatchEndpointMutationCommand.watchNextWatchEndpointMutationCommand;
                    }
                    case 263232509: {
                        return CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand.createBackstageRepostCommand;
                    }
                    case 259738798: {
                        return ajep.b;
                    }
                    case 257016449: {
                        return GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.getPdgBuyFlowCommand;
                    }
                    case 256231008: {
                        return LiveChatActionEndpointOuterClass$LiveChatActionEndpoint.liveChatActionEndpoint;
                    }
                    case 254834803: {
                        return SaveImageToDeviceEndpointOuterClass.saveImageToDeviceEndpoint;
                    }
                    case 253749840: {
                        return ajli.b;
                    }
                    case 252663493: {
                        return CloseSponsorshipsDialogCommandOuterClass$CloseSponsorshipsDialogCommand.closeSponsorshipsDialogCommand;
                    }
                    case 251724126: {
                        return EnableAutoplayCommandOuterClass$EnableAutoplayCommand.enableAutoplayCommand;
                    }
                    case 251724125: {
                        return DisableAutoplayCommandOuterClass$DisableAutoplayCommand.disableAutoplayCommand;
                    }
                    case 251348489: {
                        return RemoveBannerFromLiveChatCommandOuterClass.removeBannerForLiveChatCommand;
                    }
                    case 251308734: {
                        return amrv.b;
                    }
                    case 250570650: {
                        return LoopCommandOuterClass$LoopCommand.loopCommand;
                    }
                    case 249902542: {
                        return AddBannerToLiveChatCommandOuterClass.addBannerToLiveChatCommand;
                    }
                    case 248050398: {
                        return ImagePreviewSelectCommandOuterClass.imagePreviewSelectCommand;
                    }
                    case 247401431: {
                        return amid.b;
                    }
                    case 246536901: {
                        return ShowNoConnectionBarCommandOuterClass$ShowNoConnectionBarCommand.showNoConnectionBarCommand;
                    }
                    case 246157926: {
                        return LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.localWatchHistoryCommand;
                    }
                    case 245319097: {
                        return EnterVrModeCommandOuterClass$EnterVrModeCommand.enterVrModeCommand;
                    }
                    case 245120411: {
                        return ResetSearchBarCommandOuterClass$ResetSearchBarCommand.resetSearchBarCommand;
                    }
                    case 245093374: {
                        return LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.logFirebaseEventCommand;
                    }
                    case 243963315: {
                        return ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.showWebViewDialogCommand;
                    }
                    case 242013526: {
                        return ShowSearchContentsCommandOuterClass$ShowSearchContentsCommand.showSearchContentsCommand;
                    }
                    case 241429407: {
                        return UpdateImagePreviewCommandOuterClass.updateImagePreviewCommand;
                    }
                    case 240912718: {
                        return LiveChatAction$CloseLiveChatActionPanelAction.closeLiveChatActionPanelAction;
                    }
                    case 240199717: {
                        return ShowSystemInfoDialogCommandOuterClass$ShowSystemInfoDialogCommand.showSystemInfoDialogCommand;
                    }
                    case 239906307: {
                        return SendLiveChatVoteEndpointOuterClass$SendLiveChatVoteEndpoint.sendLiveChatVoteEndpoint;
                    }
                    case 239281785: {
                        return LiveChatAction$UpdateLiveChatPollAction.updateLiveChatPollAction;
                    }
                    case 238715030: {
                        return LiveChatAction$CancelVoteAction.cancelVoteAction;
                    }
                    case 238110852: {
                        return LiveChatAction$ShowLiveChatActionPanelAction.showLiveChatActionPanelAction;
                    }
                    case 230628345: {
                        return CloseSuggestedPlaylistVideosSheetCommandOuterClass$CloseSuggestedPlaylistVideosSheetCommand.closeSuggestedPlaylistVideosSheetCommand;
                    }
                    case 230421059: {
                        return AcknowledgeChannelTouStrikeCommandOuterClass$AcknowledgeChannelTouStrikeCommand.acknowledgeChannelTouStrikeCommand;
                    }
                    case 229815794: {
                        return GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand.getSuggestedPlaylistVideosCommand;
                    }
                    case 229250685: {
                        return ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.toggleMultiSelectVideoItemCommand;
                    }
                    case 228198035: {
                        return HideItemSectionVideosByIdCommandOuterClass$HideItemSectionVideosByIdCommand.hideItemSectionVideosByIdCommand;
                    }
                    case 222848684: {
                        return ClickLoggingWrapperCommandOuterClass.clickLoggingWrapperCommand;
                    }
                    case 220410683: {
                        return StopBroadcastOptionCommandOuterClass$StopBroadcastOptionCommand.stopBroadcastOptionCommand;
                    }
                    case 220358198: {
                        return LiveChatAction$ForceLiveChatContinuationCommand.forceLiveChatContinuationCommand;
                    }
                    case 219123099: {
                        return UpdateDonationShelfCommandOuterClass$UpdateDonationShelfCommand.updateDonationShelfCommand;
                    }
                    case 217224308: {
                        return AppIsInstalledCommandOuterClass.appIsInstalledCommand;
                    }
                    case 216268018: {
                        return CreatePostCommandOuterClass.createPostCommand;
                    }
                    case 215581778: {
                        return YpcPauseMembershipDialogCommandOuterClass$YpcPauseMembershipDialogCommand.ypcPauseMembershipDialogCommand;
                    }
                    case 215442723: {
                        return UserMentionSuggestionsEndpointOuterClass$UserMentionSuggestionsEndpoint.userMentionSuggestionsEndpoint;
                    }
                    case 214850962: {
                        return CreateLivestreamHighlightClipCommandOuterClass.createLivestreamHighlightClipCommand;
                    }
                    case 214503604: {
                        return ProfileCardCommandOuterClass$ProfileCardCommand.profileCardCommand;
                    }
                    case 209133170: {
                        return ShowSponsorshipsDialogCommandOuterClass$ShowSponsorshipsDialogCommand.showSponsorshipsDialogCommand;
                    }
                    case 206638672: {
                        return ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.showCommentSimpleboxCommand;
                    }
                    case 206635851: {
                        return ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.showReelsCommentsOverlayCommand;
                    }
                    case 204491626: {
                        return OpenAdsWebViewInBrowserCommandOuterClass.openAdsWebViewInBrowserCommand;
                    }
                    case 204158123: {
                        return ajmu.a;
                    }
                    case 200453700: {
                        return InlineMutedWatchEndpointMutationCommandOuterClass$InlineMutedWatchEndpointMutationCommand.inlineMutedWatchEndpointMutationCommand;
                    }
                    case 200394150: {
                        return ShowSponsorshipsEngagementPanelCommandOuterClass$ShowSponsorshipsEngagementPanelCommand.showSponsorshipsEngagementPanelCommand;
                    }
                    case 199835557: {
                        return PreloadAppStoreCommandOuterClass.preloadAppStoreCommand;
                    }
                    case 198340511: {
                        return OpenSuperStickerBuyFlowCommandOuterClass$OpenSuperStickerBuyFlowCommand.openSuperStickerBuyFlowCommand;
                    }
                    case 196607391: {
                        return InlineAuthCommandOuterClass$InlineAuthCommand.inlineAuthCommand;
                    }
                    case 195899132: {
                        return SetAppThemeCommandOuterClass$SetAppThemeCommand.setAppThemeCommand;
                    }
                    case 195335229: {
                        return ShowTooltipCommandOuterClass.showTooltipCommand;
                    }
                    case 194801007: {
                        return AddFollowUpSurveyCommandOuterClass$AddFollowUpSurveyCommand.addFollowUpSurveyCommand;
                    }
                    case 194259476: {
                        return AccountUnlinkCommandOuterClass$AccountUnlinkCommand.accountUnlinkCommand;
                    }
                    case 194259413: {
                        return AccountLinkCommandOuterClass$AccountLinkCommand.accountLinkCommand;
                    }
                    case 194168203: {
                        return GamingAccountLinkConfirmDialogCommandOuterClass$GamingAccountLinkConfirmDialogCommand.gamingAccountLinkConfirmDialogCommand;
                    }
                    case 194162732: {
                        return GamingAccountLinkSettingCommandOuterClass$GamingAccountLinkSettingCommand.gamingAccountLinkSettingCommand;
                    }
                    case 193239995: {
                        return SilentSubmitUserFeedbackCommandOuterClass$SilentSubmitUserFeedbackCommand.silentSubmitUserFeedbackCommand;
                    }
                    case 192838928: {
                        return LogYpcFlowDismissCommandOuterClass$LogYpcFlowDismissCommand.logYpcFlowDismissCommand;
                    }
                    case 191943580: {
                        return YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.ypcResumeSubscriptionCommand;
                    }
                    case 191842732: {
                        return alvs.b;
                    }
                    case 191776071: {
                        return anrs.b;
                    }
                    case 191762785: {
                        return YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.ypcPauseSubscriptionCommand;
                    }
                    case 191373512: {
                        return RefreshConfigCommandOuterClass$RefreshConfigCommand.refreshConfigCommand;
                    }
                    case 191342865: {
                        return LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.logYpcFlowStartCommand;
                    }
                    case 189079648: {
                        return RelatedChipEndpoint$RelatedChipCommand.relatedChipCommand;
                    }
                    case 188662615: {
                        return ajgn.b;
                    }
                    case 187251317: {
                        return MultiReelDismissalEndpointCommandOuterClass$MultiReelDismissalEndpointCommand.multiReelDismissalEndpointCommand;
                    }
                    case 185598973: {
                        return OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand;
                    }
                    case 183437148: {
                        return HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint;
                    }
                    case 182223933: {
                        return BackgroundFetchBrowseCommandOuterClass$BackgroundFetchBrowseCommand.backgroundFetchBrowseCommand;
                    }
                    case 181233165: {
                        return LiveChatAction.showLiveChatSurveyCommand;
                    }
                    case 179103219: {
                        return AppDeepLinkEndpointOuterClass.appDeepLinkEndpoint;
                    }
                    case 177327295: {
                        return RefreshCommandOuterClass$RefreshCommand.refreshCommand;
                    }
                    case 174116574: {
                        return CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand;
                    }
                    case 173351111: {
                        return ShowSystemToastActionOuterClass$ShowSystemToastAction.showSystemToastAction;
                    }
                    case 171338118: {
                        return OfflineVideoWithOfflineabilityEndpointOuterClass$OfflineVideoWithOfflineabilityEndpoint.offlineVideoWithOfflineabilityEndpoint;
                    }
                    case 171313789: {
                        return ModifyReportFormCommandOuterClass$ModifyReportFormCommand.modifyReportFormCommand;
                    }
                    case 171299322: {
                        return LiveChatAction$ShowLiveChatDialogAction.showLiveChatDialogAction;
                    }
                    case 170883367: {
                        return ReplaceBackstagePostActionOuterClass.replaceBackstagePostAction;
                    }
                    case 168118343: {
                        return aljq.b;
                    }
                    case 167996903: {
                        return MultiPageStickerCatalogEndpointOuterClass$MultiPageStickerCatalogEndpoint.multiPageStickerCatalogEndpoint;
                    }
                    case 167912809: {
                        return LiveChatAction.replaceLiveChatRendererAction;
                    }
                    case 167315449: {
                        return DownloadsPageEndpointOuterClass.downloadsPageEndpoint;
                    }
                    case 167221110: {
                        return anto.b;
                    }
                    case 167146950: {
                        return ReplaceCompanionEndpointOuterClass$ReplaceCompanionEndpoint.replaceCompanionEndpoint;
                    }
                    case 166907542: {
                        return TimeDelayedEndpoint$CancelTimeDelayedEndpoint.cancelTimeDelayedEndpoint;
                    }
                    case 166884902: {
                        return RecordUserEventTokenActionOuterClass$RecordUserEventTokenAction.recordUserEventTokenAction;
                    }
                    case 166864056: {
                        return ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction.clearPersistentCacheAction;
                    }
                    case 166773264: {
                        return ajar.b;
                    }
                    case 165983090: {
                        return CompleteTransactionActionOuterClass$CompleteTransactionAction.completeTransactionAction;
                    }
                    case 165976025: {
                        return TimeDelayedEndpoint$CreateTimeDelayedEndpoint.createTimeDelayedEndpoint;
                    }
                    case 165047913: {
                        return YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.ypcHandleTransactionEndpoint;
                    }
                    case 164988379: {
                        return MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.mdxPlaybackEndpoint;
                    }
                    case 163531772: {
                        return apgm.b;
                    }
                    case 163501208: {
                        return ShowEngagementPanelNavigationEndpointOuterClass$ShowEngagementPanelNavigationEndpoint.showEngagementPanelNavigationEndpoint;
                    }
                    case 162669933: {
                        return SurveyEndpointOuterClass$SurveyEndpoint.surveyEndpoint;
                    }
                    case 160595833: {
                        return InlineUnmuteEndpointOuterClass.inlineUnmuteEndpoint;
                    }
                    case 160183255: {
                        return FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.formfillPostSubmitEndpoint;
                    }
                    case 159170544: {
                        return ScanCodeEndpointOuterClass$ScanCodeEndpoint.scanCodeEndpoint;
                    }
                    case 155595733: {
                        return PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.phoneVerificationEndpoint;
                    }
                    case 154446441: {
                        return ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.shoppingDrawerEndpoint;
                    }
                    case 154342739: {
                        return VideoSelectedActionOuterClass$VideoSelectedAction.videoSelectedAction;
                    }
                    case 153734793: {
                        return ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.reelEditVideoEndpoint;
                    }
                    case 153675053: {
                        return AddPlaceEndpointOuterClass$AddPlaceEndpoint.addPlaceEndpoint;
                    }
                    case 153501069: {
                        return StickerCatalogEndpointOuterClass$StickerCatalogEndpoint.stickerCatalogEndpoint;
                    }
                    case 153495733: {
                        return GoogleMapsNavigationEndpointOuterClass.googleMapsNavigationEndpoint;
                    }
                    case 152893416: {
                        return YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint.ypcCancelSurveyEndpoint;
                    }
                    case 152328454: {
                        return DeleteReelItem$DeleteReelItemEndpoint.deleteReelItemEndpoint;
                    }
                    case 152316869: {
                        return YpcFixInstrumentEndpoint$YPCFixInstrumentEndpoint.ypcFixInstrumentEndpoint;
                    }
                    case 152165632: {
                        return ShowInterstitialActionOuterClass$ShowInterstitialAction.showInterstitialAction;
                    }
                    case 151765852: {
                        return YpcUpdateFopEndpoint$YPCUpdateFopEndpoint.ypcUpdateFopEndpoint;
                    }
                    case 150929833: {
                        return VarispeedPickerEndpointOuterClass$VarispeedPickerEndpoint.varispeedPickerEndpoint;
                    }
                    case 149968475: {
                        return LiveChatAction$ReplaceChatItemAction.replaceChatItemAction;
                    }
                    case 149801128: {
                        return UpdateHorizontalCardListActionEndpointOuterClass$UpdateHorizontalCardListActionEndpoint.updateHorizontalCardListActionEndpoint;
                    }
                    case 148127366: {
                        return InlineMutedSettingsMenuEndpointOuterClass$InlineMutedSettingsMenuEndpoint.inlineMutedSettingsMenuEndpoint;
                    }
                    case 147899445: {
                        return StartStreamEndpointOuterClass$StartStreamEndpoint.startStreamEndpoint;
                    }
                    case 147869735: {
                        return GetBroadcastSetupEndpointOuterClass$GetBroadcastSetupEndpoint.getBroadcastSetupEndpoint;
                    }
                    case 147359084: {
                        return ShowSubscribePromoActionOuterClass$ShowSubscribePromoAction.showSubscribePromoAction;
                    }
                    case 147074744: {
                        return GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.getScheduledBroadcastsEndpoint;
                    }
                    case 146867030: {
                        return LiveChatDialogEndpointOuterClass$LiveChatDialogEndpoint.liveChatDialogEndpoint;
                    }
                    case 145708817: {
                        return CreateBroadcastEndpointOuterClass$CreateBroadcastEndpoint.createBroadcastEndpoint;
                    }
                    case 145308295: {
                        return OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.openCreateReplyDialogAction;
                    }
                    case 145132565: {
                        return LiveChatAction$ReplayChatItemAction.replayChatItemAction;
                    }
                    case 144891985: {
                        return CreationEntryEndpointOuterClass$CreationEntryEndpoint.creationEntryEndpoint;
                    }
                    case 144224893: {
                        return anzh.b;
                    }
                    case 144153690: {
                        return ShowModifyChannelNotificationOptionsEndpointOuterClass$ShowModifyChannelNotificationOptionsEndpoint.showModifyChannelNotificationOptionsEndpoint;
                    }
                    case 143505435: {
                        return ModifyActivityCountActionOuterClass$ModifyActivityCountAction.modifyActivityCountAction;
                    }
                    case 142202467: {
                        return CameraFlashEndpointOuterClass$CameraFlashEndpoint.cameraFlashEndpoint;
                    }
                    case 142199843: {
                        return MicrophoneCaptureEndpointOuterClass$MicrophoneCaptureEndpoint.microphoneCaptureEndpoint;
                    }
                    case 142199674: {
                        return ChatVisibilityEndpointOuterClass$ChatVisibilityEndpoint.chatVisibilityEndpoint;
                    }
                    case 142199568: {
                        return SwitchCameraEndpointOuterClass$SwitchCameraEndpoint.switchCameraEndpoint;
                    }
                    case 141942083: {
                        return ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand;
                    }
                    case 141229392: {
                        return anzc.b;
                    }
                    case 140507150: {
                        return OfflineRefreshEndpointOuterClass$OfflineRefreshEndpoint.offlineRefreshEndpoint;
                    }
                    case 139979438: {
                        return LightweightCameraEndpointOuterClass$LightweightCameraEndpoint.lightweightCameraEndpoint;
                    }
                    case 139828682: {
                        return UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.updateHorizontalCardListAction;
                    }
                    case 139609360: {
                        return UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.updateBackstagePollAction;
                    }
                    case 139608561: {
                        return ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint;
                    }
                    case 139017149: {
                        return UpdateBroadcastParticipantCommandOuterClass.updateBroadcastParticipantCommand;
                    }
                    case 138833813: {
                        return AddBroadcastParticipantCommandOuterClass.addBroadcastParticipantCommand;
                    }
                    case 138681778: {
                        return ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint;
                    }
                    case 137739979: {
                        return aogw.b;
                    }
                    case 137730199: {
                        return YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.ypcCompleteTransactionEndpoint;
                    }
                    case 137332281: {
                        return CommentsStreamReloadEndpointOuterClass$CommentsStreamReloadEndpoint.commentsStreamReloadEndpoint;
                    }
                    case 136550626: {
                        return EditVideoThumbnailEndpointOuterClass$EditVideoThumbnailEndpoint.editVideoThumbnailEndpoint;
                    }
                    case 136527603: {
                        return UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.updateToggleButtonTextAction;
                    }
                    case 136048375: {
                        return LiveChatAction$DimChatItemAction.dimChatItemAction;
                    }
                    case 135843030: {
                        return ShowLiveChatItemEndpointOuterClass$ShowLiveChatItemEndpoint.showLiveChatItemEndpoint;
                    }
                    case 135727656: {
                        return ScrollToSectionEndpointOuterClass$ScrollToSectionEndpoint.scrollToSectionEndpoint;
                    }
                    case 135486026: {
                        return ShowContentPillActionOuterClass$ShowContentPillAction.showContentPillAction;
                    }
                    case 135377179: {
                        return LiveChatAction$MarkChatItemAsDeletedAction.markChatItemAsDeletedAction;
                    }
                    case 135114359: {
                        return ShowNotificationOptInRendererActionOuterClass$ShowNotificationOptInRendererAction.showNotificationOptInRendererAction;
                    }
                    case 134477788: {
                        return PhoneVerificationContactNumberInputEndpointOuterClass$PhoneVerificationContactNumberInputEndpoint.phoneVerificationContactNumberInputEndpoint;
                    }
                    case 134103788: {
                        return MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint.mobileBroadcastSetupShowAdvancedSettingsScreenEndpoint;
                    }
                    case 133968669: {
                        return LiveChatAction$MarkChatItemsByAuthorAsDeletedAction.markChatItemsByAuthorAsDeletedAction;
                    }
                    case 133724106: {
                        return YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.ypcGetOfflineUpsellEndpoint;
                    }
                    case 133716455: {
                        return ManageLiveChatUserEndpointOuterClass$ManageLiveChatUserEndpoint.manageLiveChatUserEndpoint;
                    }
                    case 133030216: {
                        return LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.liveChatPurchaseMessageEndpoint;
                    }
                    case 132845915: {
                        return LiveChatAction$AddLiveChatTickerItemAction.addLiveChatTickerItemAction;
                    }
                    case 132716540: {
                        return LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint;
                    }
                    case 132445607: {
                        return PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint.phoneVerificationCodeInputScreenEndpoint;
                    }
                    case 132194316: {
                        return PhoneVerificationCodeInputResultEndpointOuterClass$PhoneVerificationCodeInputResultEndpoint.phoneVerificationCodeInputResultEndpoint;
                    }
                    case 131794550: {
                        return ValidateVerificationCodeEndpointOuterClass$ValidateVerificationCodeEndpoint.validateVerificationCodeEndpoint;
                    }
                    case 131467272: {
                        return RefreshAppActionOuterClass$RefreshAppAction.refreshAppAction;
                    }
                    case 131184017: {
                        return ToggleConversationEndpointOuterClass$ToggleConversationEndpoint.toggleConversationEndpoint;
                    }
                    case 130528991: {
                        return ToggleConversationActionOuterClass$ToggleConversationAction.toggleConversationAction;
                    }
                    case 130295727: {
                        return LiveChatAction$RemoveChatItemAction.removeChatItemAction;
                    }
                    case 130003709: {
                        return RequestVerificationCodeEndpointOuterClass$RequestVerificationCodeEndpoint.requestVerificationCodeEndpoint;
                    }
                    case 129686418: {
                        return LiveAcceptTosEndpointOuterClass$LiveAcceptTosEndpoint.liveAcceptTosEndpoint;
                    }
                    case 129506414: {
                        return UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.unlimitedManageFamilyEndpoint;
                    }
                    case 129377887: {
                        return EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.editNonGaiaConnectionStateEndpoint;
                    }
                    case 128828810: {
                        return AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.androidOsApplicationSettingsEndpoint;
                    }
                    case 128200871: {
                        return UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.unlimitedFamilyFlowEndpoint;
                    }
                    case 128069078: {
                        return UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.unlimitedCreateFamilyEndpoint;
                    }
                    case 127759225: {
                        return MobileBroadcastSetupShowGoLiveScreenEndpointOuterClass$MobileBroadcastSetupShowGoLiveScreenEndpoint.mobileBroadcastSetupShowGoLiveScreenEndpoint;
                    }
                    case 127156142: {
                        return EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.editConversationNameEntryEndpoint;
                    }
                    case 126831092: {
                        return ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction.clearNotificationsUnreadCountAction;
                    }
                    case 126705043: {
                        return apgg.b;
                    }
                    case 126354119: {
                        return AddContactsEndpointOuterClass$AddContactsEndpoint.addContactsEndpoint;
                    }
                    case 126084307: {
                        return LiveChatAction$AddLiveChatTextMessageFromTemplateAction.addLiveChatTextMessageFromTemplateAction;
                    }
                    case 125827176: {
                        return BackstageImageUploadEndpointOuterClass$BackstageImageUploadEndpoint.backstageImageUploadEndpoint;
                    }
                    case 125707981: {
                        return RemoveUnblockedContactActionOuterClass$RemoveUnblockedContactAction.removeUnblockedContactAction;
                    }
                    case 125606357: {
                        return ModerateLiveChatEndpointOuterClass$ModerateLiveChatEndpoint.moderateLiveChatEndpoint;
                    }
                    case 124861221: {
                        return UpdatedMetadataEndpointOuterClass$UpdatedMetadataEndpoint.updatedMetadataEndpoint;
                    }
                    case 124581055: {
                        return TakePictureForThumbnailEndpointOuterClass$TakePictureForThumbnailEndpoint.takePictureForThumbnailEndpoint;
                    }
                    case 124510444: {
                        return RemoveUpcomingEventReminderEndpointOuterClass$RemoveUpcomingEventReminderEndpoint.removeUpcomingEventReminderEndpoint;
                    }
                    case 124290411: {
                        return SignalServiceEndpointOuterClass$SignalServiceEndpoint.signalServiceEndpoint;
                    }
                    case 123790168: {
                        return AddUpcomingEventReminderEndpointOuterClass$AddUpcomingEventReminderEndpoint.addUpcomingEventReminderEndpoint;
                    }
                    case 123140429: {
                        return NerdStatsEndpointOuterClass$NerdStatsEndpoint.nerdStatsEndpoint;
                    }
                    case 122558141: {
                        return UpdateCommentReplyDialogEndpointOuterClass$UpdateCommentReplyDialogEndpoint.updateCommentReplyDialogEndpoint;
                    }
                    case 122557296: {
                        return UpdateCommentDialogEndpointOuterClass$UpdateCommentDialogEndpoint.updateCommentDialogEndpoint;
                    }
                    case 122546829: {
                        return LiveCreationEndpointOuterClass$LiveCreationEndpoint.liveCreationEndpoint;
                    }
                    case 122458429: {
                        return LiveChatItemContextMenuEndpointOuterClass$LiveChatItemContextMenuEndpoint.liveChatItemContextMenuEndpoint;
                    }
                    case 122330696: {
                        return InsertInRemoteQueueEndpointOuterClass$InsertInRemoteQueueEndpoint.insertInRemoteQueueEndpoint;
                    }
                    case 122289677: {
                        return CreateCommentDialogEndpointOuterClass$CreateCommentDialogEndpoint.createCommentDialogEndpoint;
                    }
                    case 120929770: {
                        return SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.sendLiveChatMessageEndpoint;
                    }
                    case 120837120: {
                        return BrowseSectionListReloadEndpointOuterClass$BrowseSectionListReloadEndpoint.browseSectionListReloadEndpoint;
                    }
                    case 119886855: {
                        return MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.mdxConnectNavigationEndpoint;
                    }
                    case 119065485: {
                        return UpdateCommentVoteActionOuterClass$UpdateCommentVoteAction.updateCommentVoteAction;
                    }
                    case 118402118: {
                        return AndroidIntentActionEndpointOuterClass.androidIntentActionEndpoint;
                    }
                    case 117834934: {
                        return CreateBackstagePostDialogEndpointOuterClass$CreateBackstagePostDialogEndpoint.createBackstagePostDialogEndpoint;
                    }
                    case 117735229: {
                        return SharePrivateVideoEndpointOuterClass$SharePrivateVideoEndpoint.sharePrivateVideoEndpoint;
                    }
                    case 117298952: {
                        return LiveChatAction$AddChatItemAction.addChatItemAction;
                    }
                    case 116980193: {
                        return PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.prefetchSharePanelEndpoint;
                    }
                    case 116405387: {
                        return ShowPurchaseConfirmationDialogActionOuterClass$ShowPurchaseConfirmationDialogAction.showPurchaseConfirmationDialogAction;
                    }
                    case 115091725: {
                        return NavigateAndOpenDialogEndpointOuterClass.navigateAndOpenDialogEndpoint;
                    }
                    case 114390071: {
                        return ClientActionEndpointOuterClass$ClientActionEndpoint.clientActionEndpoint;
                    }
                    case 113762617: {
                        return GetReportFormEndpointOuterClass$GetReportFormEndpoint.getReportFormEndpoint;
                    }
                    case 113001276: {
                        return EditChannelBannerEndpointOuterClass$EditChannelBannerEndpoint.editChannelBannerEndpoint;
                    }
                    case 109865460: {
                        return ShowMealbarActionOuterClass$ShowMealbarAction.showMealbarAction;
                    }
                    case 106983893: {
                        return AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.androidShareIntentEndpoint;
                    }
                    case 106613511: {
                        return ModalEndpointOuterClass$ModalEndpoint.modalEndpoint;
                    }
                    case 106358471: {
                        return ClearAppBadgeActionOuterClass$ClearAppBadgeAction.clearAppBadgeAction;
                    }
                    case 106088718: {
                        return ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.channelProfileFieldEditorEndpoint;
                    }
                    case 105751339: {
                        return SubtitlesEndpointOuterClass$SubtitlesEndpoint.subtitlesEndpoint;
                    }
                    case 105643691: {
                        return ConnectionInviteUrlEndpointOuterClass$ConnectionInviteUrlEndpoint.connectionInviteUrlEndpoint;
                    }
                    case 105496274: {
                        return MdxViewVideoInfoEndpointOuterClass$MdxViewVideoInfoEndpoint.mdxViewVideoInfoEndpoint;
                    }
                    case 104886333: {
                        return UpdateViewershipActionOuterClass$UpdateViewershipAction.updateViewershipAction;
                    }
                    case 104383677: {
                        return AuthorizedUrlEndpointOuterClass.authorizedUrlEndpoint;
                    }
                    case 102687288: {
                        return OpenSourceLicensesEndpointOuterClass$OpenSourceLicensesEndpoint.openSourceLicensesEndpoint;
                    }
                    case 102580987: {
                        return RemoveContactActionOuterClass$RemoveContactAction.removeContactAction;
                    }
                    case 102200546: {
                        return UpdateBrowseTabNewContentActionOuterClass$UpdateBrowseTabNewContentAction.updateBrowseTabNewContentAction;
                    }
                    case 101493342: {
                        return ChannelProfileEditorEndpointOuterClass$ChannelProfileEditorEndpoint.channelProfileEditorEndpoint;
                    }
                    case 100946440: {
                        return PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.phoneDialerEndpoint;
                    }
                    case 100723586: {
                        return UpdateCommentReplyEndpointOuterClass$UpdateCommentReplyEndpoint.updateCommentReplyEndpoint;
                    }
                    case 100498558: {
                        return AudioTrackPickerEndpointOuterClass$AudioTrackPickerEndpoint.audioTrackPickerEndpoint;
                    }
                    case 99968691: {
                        return RemoveNotificationTrayItemActionOuterClass$RemoveNotificationTrayItemAction.removeNotificationTrayItemAction;
                    }
                    case 99404607: {
                        return GetPhotoEndpointOuterClass$GetPhotoEndpoint.getPhotoEndpoint;
                    }
                    case 99402190: {
                        return UploadPhotoEndpointOuterClass$UploadPhotoEndpoint.uploadPhotoEndpoint;
                    }
                    case 99326409: {
                        return UpdateCommentEndpointOuterClass$UpdateCommentEndpoint.updateCommentEndpoint;
                    }
                    case 98957793: {
                        return CameraEndpointOuterClass.cameraEndpoint;
                    }
                    case 98695964: {
                        return ContactMenuEndpointOuterClass$ContactMenuEndpoint.contactMenuEndpoint;
                    }
                    case 98444775: {
                        return PingingEndpointOuterClass$PingingEndpoint.pingingEndpoint;
                    }
                    case 98150882: {
                        return MenuEndpointOuterClass$MenuEndpoint.menuEndpoint;
                    }
                    case 96329534: {
                        return ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.conversationWithReplyEndpoint;
                    }
                    case 95591119: {
                        return ManagePurchaseEndpointOuterClass$ManagePurchaseEndpoint.managePurchaseEndpoint;
                    }
                    case 95253721: {
                        return YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint;
                    }
                    case 95237586: {
                        return CreateCommentReplyDialogEndpointOuterClass$CreateCommentReplyDialogEndpoint.createCommentReplyDialogEndpoint;
                    }
                    case 94476261: {
                        return amqf.b;
                    }
                    case 93440769: {
                        return PlaylistEditorEndpointOuterClass$PlaylistEditorEndpoint.playlistEditorEndpoint;
                    }
                    case 92775415: {
                        return SendShareEndpoint$SendShareToContactsEndpoint.sendShareToContactsEndpoint;
                    }
                    case 92589349: {
                        return SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint;
                    }
                    case 92310068: {
                        return SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint;
                    }
                    case 90650344: {
                        return ShareEndpointOuterClass$ShareEntityEndpoint.shareEntityEndpoint;
                    }
                    case 90633539: {
                        return CopyUrlEndpoint$CopyURLEndpoint.copyUrlEndpoint;
                    }
                    case 90566164: {
                        return TextMessageEndpointOuterClass$TextMessageEndpoint.textMessageEndpoint;
                    }
                    case 90427601: {
                        return EditConnectionStateEndpointOuterClass$EditConnectionStateEndpoint.editConnectionStateEndpoint;
                    }
                    case 90198251: {
                        return CopyTextEndpointOuterClass$CopyTextEndpoint.copyTextEndpoint;
                    }
                    case 90195593: {
                        return ModifyChannelNotificationPreferenceEndpointOuterClass$ModifyChannelNotificationPreferenceEndpoint.modifyChannelNotificationPreferenceEndpoint;
                    }
                    case 90188060: {
                        return ShowChannelNotificationPreferenceDialogActionOuterClass$ShowChannelNotificationPreferenceDialogAction.showChannelNotificationPreferenceDialogAction;
                    }
                    case 89668214: {
                        return ajdr.b;
                    }
                    case 89537644: {
                        return OfflineVideosEndpointOuterClass.offlineVideosEndpoint;
                    }
                    case 88642421: {
                        return YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.ypcCancelRecurrenceEndpoint;
                    }
                    case 88564668: {
                        return EditConversationPostEndpointOuterClass$EditConversationPostEndpoint.editConversationPostEndpoint;
                    }
                    case 86611299: {
                        return ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint.clearSearchHistorySettingEndpoint;
                    }
                    case 85732730: {
                        return ClearRemoteQueueEndpointOuterClass$ClearRemoteQueueEndpoint.clearRemoteQueueEndpoint;
                    }
                    case 85650004: {
                        return CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.createPlaylistEndpoint;
                    }
                    case 85383280: {
                        return ShareEndpointOuterClass$ShareEndpoint.shareEndpoint;
                    }
                    case 83457823: {
                        return AdChoicesDialogEndpointOuterClass$AdChoicesDialogEndpoint.adChoicesDialogEndpoint;
                    }
                    case 81212182: {
                        return SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.setClientSettingEndpoint;
                    }
                    case 80296137: {
                        return ConversationParticipantsEndpointOuterClass$ConversationParticipantsEndpoint.conversationParticipantsEndpoint;
                    }
                    case 80252293: {
                        return VideoManagerEndpointOuterClass$VideoManagerEndpoint.videoManagerEndpoint;
                    }
                    case 79296801: {
                        return AdFeedbackEndpointOuterClass$AdFeedbackEndpoint.adFeedbackEndpoint;
                    }
                    case 79289575: {
                        return ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.confirmDialogEndpoint;
                    }
                    case 79216710: {
                        return ApplicationHelpEndpointOuterClass.applicationHelpEndpoint;
                    }
                    case 78414307: {
                        return RecordNotificationInteractionsEndpointOuterClass$RecordNotificationInteractionsEndpoint.recordNotificationInteractionsEndpoint;
                    }
                    case 77872990: {
                        return SetSettingEndpointOuterClass$SetSettingEndpoint.setSettingEndpoint;
                    }
                    case 77611383: {
                        return VideoQualityPickerEndpointOuterClass$VideoQualityPickerEndpoint.videoQualityPickerEndpoint;
                    }
                    case 77364463: {
                        return WebviewEndpointOuterClass$WebviewEndpoint.webviewEndpoint;
                    }
                    case 77303502: {
                        return anis.a;
                    }
                    case 77297742: {
                        return HideEnclosingActionOuterClass$HideEnclosingAction.hideEnclosingAction;
                    }
                    case 77297283: {
                        return ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.replaceEnclosingAction;
                    }
                    case 77296946: {
                        return InviteMoreEndpointOuterClass$InviteMoreEndpoint.inviteMoreEndpoint;
                    }
                    case 77196420: {
                        return SelectActiveIdentityEndpointOuterClass$SelectActiveIdentityEndpoint.selectActiveIdentityEndpoint;
                    }
                    case 77125633: {
                        return ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.channelCreationFormEndpoint;
                    }
                    case 76638993: {
                        return FlagEndpointOuterClass$FlagEndpoint.flagEndpoint;
                    }
                    case 76623563: {
                        return AddToToastActionOuterClass$AddToToastAction.addToToastAction;
                    }
                    case 76177954: {
                        return AddToRemoteQueueEndpointOuterClass$AddToRemoteQueueEndpoint.addToRemoteQueueEndpoint;
                    }
                    case 75948536: {
                        return UndoFeedbackEndpointOuterClass$UndoFeedbackEndpoint.undoFeedbackEndpoint;
                    }
                    case 75581109: {
                        return SendSmsEndpointOuterClass$SendSmsEndpoint.sendSmsEndpoint;
                    }
                    case 75058710: {
                        return ChannelCreationServiceEndpointOuterClass$ChannelCreationServiceEndpoint.channelCreationServiceEndpoint;
                    }
                    case 74232392: {
                        return FlagVideoEndpointOuterClass$FlagVideoEndpoint.flagVideoEndpoint;
                    }
                    case 74232380: {
                        return CaptionPickerEndpointOuterClass$CaptionPickerEndpoint.captionPickerEndpoint;
                    }
                    case 73844191: {
                        return SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.sharePlaylistEndpoint;
                    }
                    case 73844178: {
                        return ShareVideoEndpointOuterClass$ShareVideoEndpoint.shareVideoEndpoint;
                    }
                    case 73082583: {
                        return OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint;
                    }
                    case 73080600: {
                        return OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint;
                    }
                    case 72579984: {
                        return UserFeedbackEndpointOuterClass.userFeedbackEndpoint;
                    }
                    case 71845583: {
                        return ConversationReplyPanelEndpointOuterClass$ConversationReplyPanelEndpoint.conversationReplyPanelEndpoint;
                    }
                    case 70874968: {
                        return MdxPairingEndpointOuterClass.mdxPairingEndpoint;
                    }
                    case 69487224: {
                        return AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.addToPlaylistEndpoint;
                    }
                    case 69108384: {
                        return MuteAdEndpointOuterClass$MuteAdEndpoint.muteAdEndpoint;
                    }
                    case 68997401: {
                        return UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.unsubscribeEndpoint;
                    }
                    case 68997349: {
                        return SubscribeEndpointOuterClass$SubscribeEndpoint.subscribeEndpoint;
                    }
                    case 68212148: {
                        return CreateCommentEndpointOuterClass$CreateCommentEndpoint.createCommentEndpoint;
                    }
                    case 66712070: {
                        return CreateCommentReplyEndpointOuterClass$CreateCommentReplyEndpoint.createCommentReplyEndpoint;
                    }
                    case 66028866: {
                        return DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.deletePendingUploadEndpoint;
                    }
                    case 65929205: {
                        return PerformCommentActionEndpointOuterClass$PerformCommentActionEndpoint.performCommentActionEndpoint;
                    }
                    case 65153809: {
                        return FeedbackEndpointOuterClass.feedbackEndpoint;
                    }
                    case 65099913: {
                        return YpcTipTransactionEndpointOuterClass$YpcTipTransactionEndpoint.ypcTipTransactionEndpoint;
                    }
                    case 65091333: {
                        return NotificationOptOutEndpointOuterClass$NotificationOptOutEndpoint.notificationOptOutEndpoint;
                    }
                    case 64982798: {
                        return RemoveFromRemoteQueueEndpointOuterClass$RemoveFromRemoteQueueEndpoint.removeFromRemoteQueueEndpoint;
                    }
                    case 64681250: {
                        return YpcOffersEndpoint$YPCOffersEndpoint.ypcOffersEndpoint;
                    }
                    case 64157372: {
                        return DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.deleteVideoEndpoint;
                    }
                    case 64091098: {
                        return DeletePlaylistEndpointOuterClass$DeletePlaylistEndpoint.deletePlaylistEndpoint;
                    }
                    case 63560970: {
                        return EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.editVideoMetadataEndpoint;
                    }
                    case 63555155: {
                        return UploadEndpointOuterClass.uploadEndpoint;
                    }
                    case 63158558: {
                        return LikeEndpointOuterClass$LikeEndpoint.likeEndpoint;
                    }
                    case 63121560: {
                        return ResumeWatchHistoryEndpointOuterClass$ResumeWatchHistoryEndpoint.resumeWatchHistoryEndpoint;
                    }
                    case 63121553: {
                        return PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.pauseWatchHistoryEndpoint;
                    }
                    case 63121550: {
                        return ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint.clearWatchHistoryEndpoint;
                    }
                    case 63120728: {
                        return DismissalEndpointOuterClass$DismissalEndpoint.dismissalEndpoint;
                    }
                    case 62975126: {
                        return AppStoreEndpointOuterClass.appStoreEndpoint;
                    }
                    case 61096701: {
                        return AndroidApplicationEndpointOuterClass.androidAppEndpoint;
                    }
                    case 60666189: {
                        return PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint;
                    }
                    case 57703777: {
                        return OfflineWatchEndpointOuterClass.offlineWatchEndpoint;
                    }
                    case 54240896: {
                        return SignOutEndpointOuterClass.signOutEndpoint;
                    }
                    case 52666186: {
                        return WatchPlaylistEndpointOuterClass.watchPlaylistEndpoint;
                    }
                    case 51958981: {
                        return OfflineEndpointOuterClass.offlineEndpoint;
                    }
                    case 50178598: {
                        return MobileV2UserFeedEndpointOuterClass.mobileV2UserFeedEndpoint;
                    }
                    case 50078082: {
                        return ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint;
                    }
                    case 49706687: {
                        return SignInEndpointOuterClass.signInEndpoint;
                    }
                    case 49679253: {
                        return UrlEndpointOuterClass.urlEndpoint;
                    }
                    case 48687757: {
                        return WatchEndpointOuterClass.watchEndpoint;
                    }
                    case 48687709: {
                        return SearchEndpointOuterClass.searchEndpoint;
                    }
                    case 48687626: {
                        return BrowseEndpointOuterClass.browseEndpoint;
                    }
                }
                break;
            }
            case 6: {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 267256503: {
                        return alnq.b;
                    }
                    case 222429344: {
                        return CardboardModeRendererOuterClass.a;
                    }
                    case 196516197: {
                        return anuk.b;
                    }
                    case 140080732: {
                        return aimx.a;
                    }
                    case 117294427: {
                        return alsa.b;
                    }
                    case 106506504: {
                        return anyj.b;
                    }
                    case 65060753: {
                        return aisr.b;
                    }
                    case 64128279: {
                        return aphy.b;
                    }
                    case 57158578: {
                        return angr.b;
                    }
                    case 54681060: {
                        return ankm.b;
                    }
                    case 50631000: {
                        return anjb.b;
                    }
                    case 50195462: {
                        return alke.b;
                    }
                    case 49399797: {
                        return anyv.b;
                    }
                }
                break;
            }
            case 5: {
                if (n == 409459387) {
                    return aqaj.b;
                }
                if (n == 409515602) {
                    return aqah.b;
                }
                if (n != 410667140) {
                    return null;
                }
                return aqal.b;
            }
            case 4: {
                if (n != 1) {
                    return null;
                }
                return aqct.b;
            }
            case 3: {
                if (n == 285231755) {
                    return aliu.a;
                }
                if (n == 285297337) {
                    return aliu.b;
                }
                if (n != 288976216) {
                    return null;
                }
                return algy.b;
            }
            case 2: {
                if (n != 60487319) {
                    return null;
                }
                return anul.b;
            }
            case 1: {
                if (n != 474412491) {
                    return null;
                }
                return aunh.b;
            }
            case 0: {
                switch (n) {
                    default: {
                        return null;
                    }
                    case 474376530: {
                        return DownloadsPageEntryPointRendererOuterClass$DownloadsPageEntryPointRenderer.downloadsPageEntryPointRenderer;
                    }
                    case 465383528: {
                        return ShortsLayoutPickerEntryRendererOuterClass.shortsLayoutPickerEntryRenderer;
                    }
                    case 462126595: {
                        return CreationSuggestionRendererOuterClass.creationSuggestionRenderer;
                    }
                    case 455964309: {
                        return anhv.b;
                    }
                    case 455752576: {
                        return CinematicContainerRendererOuterClass$CinematicContainerRenderer.cinematicContainerRenderer;
                    }
                    case 452087505: {
                        return angv.b;
                    }
                    case 447071275: {
                        return InnertubeGetReelItemWatchService.reelWatchStatusRenderer;
                    }
                    case 439944849: {
                        return ReelPlayerOverlayRendererOuterClass.reelPlayerContextualHeaderRenderer;
                    }
                    case 436517566: {
                        return SwipeoverContainerRendererOuterClass$SwipeoverContainerRenderer.swipeoverContainerRenderer;
                    }
                    case 432471502: {
                        return RecognitionShelfRendererOuterClass.recognitionShelfRenderer;
                    }
                    case 427886063: {
                        return PostEphemeralityDialogRendererOuterClass$PostEphemeralityDialogRenderer.postEphemeralityDialogRenderer;
                    }
                    case 426981673: {
                        return GenerateHandleFromNameResultRendererOuterClass.generateHandleFromNameResultRenderer;
                    }
                    case 425913887: {
                        return ReelPlayerOverlayRendererOuterClass.reelMoreButtonRenderer;
                    }
                    case 425446332: {
                        return ShortsEffectPickerEntryRendererOuterClass.shortsEffectPickerEntryRenderer;
                    }
                    case 423397617: {
                        return akea.a;
                    }
                    case 420138591: {
                        return MiniPlayerBylineRendererOuterClass.miniPlayerBylineRenderer;
                    }
                    case 420115721: {
                        return FilterChipBarElementRendererOuterClass$FilterChipBarElementRenderer.filterChipBarElementRenderer;
                    }
                    case 416656629: {
                        return alkm.a;
                    }
                    case 411621223: {
                        return ImagePollEditorRendererOuterClass$ImagePollEditorRenderer.imagePollEditorRenderer;
                    }
                    case 411466342: {
                        return PollTypeSelectionRendererOuterClass$PollTypeSelectionRenderer.pollTypeSelectionRenderer;
                    }
                    case 410636583: {
                        return ReelPlayerPausedStateRendererOuterClass.reelPlayerPausedStateRenderer;
                    }
                    case 410591241: {
                        return KeyMomentsPlayerScrimOverlayRendererOuterClass.keyMomentsPlayerScrimOverlayRenderer;
                    }
                    case 408978266: {
                        return ChapterMarkerMessagePlayerScrimOverlayRendererOuterClass.chapterMarkerMessagePlayerScrimOverlayRenderer;
                    }
                    case 404376390: {
                        return ahtu.b;
                    }
                    case 401855122: {
                        return FeaturePlayerOverlayRendererOuterClass.featurePlayerOverlayRenderer;
                    }
                    case 401855120: {
                        return PlayerOverlayLayerRendererOuterClass.playerOverlayLayerRenderer;
                    }
                    case 398124672: {
                        return SpotlightRendererOuterClass.spotlightModeControlsRenderer;
                    }
                    case 396380317: {
                        return ReelNonVideoContentRendererOuterClass.reelNonVideoContentRenderer;
                    }
                    case 392671216: {
                        return InlineBrowserCustomTabsRendererOuterClass.inlineBrowserCustomTabsRenderer;
                    }
                    case 388559631: {
                        return SpotlightRendererOuterClass.spotlightRenderer;
                    }
                    case 388503586: {
                        return aoug.a;
                    }
                    case 385814216: {
                        return HeatMarkerRendererOuterClass.heatMarkerRenderer;
                    }
                    case 384326197: {
                        return HeatmapRendererOuterClass.heatmapRenderer;
                    }
                    case 379583708: {
                        return ShortsCreationTitleRendererOuterClass.shortsCreationTitleRenderer;
                    }
                    case 373134779: {
                        return ChannelHandleValidationResultRendererOuterClass.channelHandleValidationResultRenderer;
                    }
                    case 370928821: {
                        return SelectTaggedVideoButtonRendererOuterClass.selectTaggedVideoButtonRenderer;
                    }
                    case 370727981: {
                        return ReelPlayerOverlayRendererOuterClass.reelPlayerAgeGateRenderer;
                    }
                    case 364583829: {
                        return FlowTopBarRendererOuterClass.flowTopBarRenderer;
                    }
                    case 363857730: {
                        return TvfilmOfferModuleRendererOuterClass.metadataLineRenderer;
                    }
                    case 363438807: {
                        return FlowStepRendererOuterClass.flowStepRenderer;
                    }
                    case 362416826: {
                        return BroadcastParticipantJoinScreenRendererOuterClass.broadcastParticipantJoinScreenRenderer;
                    }
                    case 361256913: {
                        return AdEngagementPanelsRendererOuterClass.adEngagementPanelsRenderer;
                    }
                    case 360311423: {
                        return FormfillConditionalDropdownInputRendererOuterClass.formfillConditionalDropdownInputRenderer;
                    }
                    case 358874198: {
                        return IconBadgeRendererOuterClass.iconBadgeRenderer;
                    }
                    case 357104971: {
                        return BelowPlayerImmersiveAdLayoutRendererOuterClass.belowPlayerImmersiveAdLayoutRenderer;
                    }
                    case 355938383: {
                        return ShortsCameraRendererOuterClass.shortsCameraRenderer;
                    }
                    case 352067590: {
                        return FeedFilterChipBarRendererOuterClass.a;
                    }
                    case 352015993: {
                        return SponsorshipsRenderers.sponsorshipsPurchaseOptionRenderer;
                    }
                    case 349616608: {
                        return AdsInlineWebsiteRendererOuterClass.adsInlineWebsiteRenderer;
                    }
                    case 347040155: {
                        return ProductRendererOuterClass.productRenderer;
                    }
                    case 346937069: {
                        return UnifiedSharePanelRendererOuterClass.shareStartTimeWithContextRenderer;
                    }
                    case 346095969: {
                        return ReelPlayerOverlayRendererOuterClass.forcedMuteMessageRenderer;
                    }
                    case 343947961: {
                        return AccountsListRenderer.googleAccountHeaderRenderer;
                    }
                    case 343935806: {
                        return AboutThisAdRendererOuterClass.aboutThisAdRenderer;
                    }
                    case 342576286: {
                        return LiveFullscreenConfirmRendererOuterClass.liveFullscreenConfirmRenderer;
                    }
                    case 331248651: {
                        return ShortsEditRendererOuterClass.shortsEditRenderer;
                    }
                    case 330817827: {
                        return TopbarCastButtonRendererOuterClass.topbarCastButtonRenderer;
                    }
                    case 329757342: {
                        return HomeAdsPanelRendererOuterClass.homeAdsPanelRenderer;
                    }
                    case 328571098: {
                        return DecoratedPlayerBarRendererOuterClass.multiMarkersPlayerBarRenderer;
                    }
                    case 325920579: {
                        return ChipCloudRendererOuterClass.chipDividerRenderer;
                    }
                    case 325110794: {
                        return UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.uploadProgressArrowRenderer;
                    }
                    case 324699028: {
                        return ReelWatchSurveyRendererOuterClass.reelWatchSurveyRenderer;
                    }
                    case 321879467: {
                        return SfvAudioSearchBoxRendererOuterClass.sfvAudioSearchBoxRenderer;
                    }
                    case 319255493: {
                        return PostImagePickerRendererOuterClass.postImagePickerRenderer;
                    }
                    case 314975903: {
                        return SelectImageCellRendererOuterClass.selectImageCellRenderer;
                    }
                    case 313670307: {
                        return SfvAudioPickerHeaderRendererOuterClass.sfvAudioPickerHeaderRenderer;
                    }
                    case 310624609: {
                        return ImageCarouselEditorRendererOuterClass.imageCarouselEditorRenderer;
                    }
                    case 310393920: {
                        return PasswordBiometricAuthRendererOuterClass$PasswordBiometricAuthRenderer.passwordBiometricAuthRenderer;
                    }
                    case 309756362: {
                        return ReelPlayerOverlayRendererOuterClass.pivotButtonRenderer;
                    }
                    case 308293426: {
                        return CreatePlaylistDialogRendererOuterClass.createPlaylistDialogRenderer;
                    }
                    case 307461429: {
                        return aoeq.a;
                    }
                    case 303209365: {
                        return ReelPlayerOverlayRendererOuterClass.reelPlayerPersistentEducationRenderer;
                    }
                    case 301667256: {
                        return AutoplaySwitchButtonRendererOuterClass.autoplaySwitchButtonRenderer;
                    }
                    case 300768458: {
                        return ConnectGpgDialogRenderer.connectGpgDialogRenderer;
                    }
                    case 294483082: {
                        return WebLinkRendererOuterClass.webLinkRenderer;
                    }
                    case 292019130: {
                        return EngagementPanelSectionListRendererOuterClass$EngagementPanelTabRenderer.engagementPanelTabRenderer;
                    }
                    case 291412923: {
                        return PendingReelUploadsBottomSheetRendererOuterClass$PendingReelUploadsBottomSheetRenderer.pendingReelUploadsBottomSheetRenderer;
                    }
                    case 286900302: {
                        return DecoratedPlayerBarRendererOuterClass.decoratedPlayerBarRenderer;
                    }
                    case 286400944: {
                        return DecoratedPlayerBarRendererOuterClass.markerRenderer;
                    }
                    case 286400616: {
                        return DecoratedPlayerBarRendererOuterClass.nonChapteredPlayerBarRenderer;
                    }
                    case 286400532: {
                        return DecoratedPlayerBarRendererOuterClass.chapterRenderer;
                    }
                    case 286400274: {
                        return DecoratedPlayerBarRendererOuterClass.chapteredPlayerBarRenderer;
                    }
                    case 278471019: {
                        return BadgeRenderers.unifiedVerifiedBadgeRenderer;
                    }
                    case 278451298: {
                        return SlimVideoMetadataSectionRendererOuterClass.slimAutotaggingVideoInformationRenderer;
                    }
                    case 278024706: {
                        return DateTimePickerRendererOuterClass.dateTimePickerRenderer;
                    }
                    case 272874397: {
                        return SlimVideoMetadataRendererOuterClass.slimChannelMetadataRenderer;
                    }
                    case 272545348: {
                        return SuggestedActionsRendererOuterClass.suggestedActionsRenderer;
                    }
                    case 272543863: {
                        return SuggestedActionsRendererOuterClass.suggestedActionRenderer;
                    }
                    case 272305921: {
                        return SlimVideoMetadataSectionRendererOuterClass.slimVideoScrollableActionBarRenderer;
                    }
                    case 269335175: {
                        return SponsorshipsRenderers.sponsorshipsPromotionRenderer;
                    }
                    case 268308731: {
                        return VcBalanceRendererOuterClass.vcBalanceRenderer;
                    }
                    case 268089666: {
                        return FirstTimeUnicornSignInRendererOuterClass.firstTimeUnicornSignInRenderer;
                    }
                    case 266982641: {
                        return ahnn.a;
                    }
                    case 265166751: {
                        return AccountLinkButtonRendererOuterClass.accountLinkButtonRenderer;
                    }
                    case 263380587: {
                        return BackstageRepostCreationRendererOuterClass.backstageRepostCreationRenderer;
                    }
                    case 260791572: {
                        return ElementsSectionListFooterRendererOuterClass.elementsSectionListFooterRenderer;
                    }
                    case 258810642: {
                        return FormfillDropdownInputRendererOuterClass.formfillDropdownInputRenderer;
                    }
                    case 253885845: {
                        return FullscreenEngagementCompanionRendererOuterClass.fullscreenEngagementCompanionRenderer;
                    }
                    case 252522038: {
                        return FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementAdSlotRenderer;
                    }
                    case 249532004: {
                        return LiveChatBannerRendererOuterClass.liveChatBannerRenderer;
                    }
                    case 249519921: {
                        return LiveChatBannerHeaderRendererOuterClass.liveChatBannerHeaderRenderer;
                    }
                    case 248250369: {
                        return TargetedAudienceSelectRendererOuterClass.targetedAudienceSelectRenderer;
                    }
                    case 248233615: {
                        return PollRendererOuterClass.pollHeaderRenderer;
                    }
                    case 247554040: {
                        return ImagePreviewSelectRendererOuterClass.imagePreviewSelectRenderer;
                    }
                    case 247323670: {
                        return RequiredSignInRendererOuterClass.requiredSignInRenderer;
                    }
                    case 246375195: {
                        return RequiredSignInRendererOuterClass.expressSignInRenderer;
                    }
                    case 246136191: {
                        return SponsorshipsRenderers.sponsorshipsOfferVideoLinkRenderer;
                    }
                    case 236157862: {
                        return LiveChatActionPanelRendererOuterClass.liveChatActionPanelRenderer;
                    }
                    case 235622043: {
                        return EffectListItemRendererOuterClass.effectListItemRenderer;
                    }
                    case 235615445: {
                        return EffectListRendererOuterClass.effectListRenderer;
                    }
                    case 232905664: {
                        return aiey.a;
                    }
                    case 232783933: {
                        return FormfillCheckboxInputRendererOuterClass.formfillCheckboxInputRenderer;
                    }
                    case 232603920: {
                        return ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.channelReelAvatarRenderer;
                    }
                    case 232525688: {
                        return PlayerOverlayVideoInteractionsOuterClass.videoInteractionPopUpRenderer;
                    }
                    case 231434348: {
                        return ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.reelShelfCreationRenderer;
                    }
                    case 228344821: {
                        return IconMessageRendererOuterClass.iconMessageRenderer;
                    }
                    case 223882085: {
                        return FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementActionBarSaveButtonRenderer;
                    }
                    case 222429344: {
                        return CardboardModeRendererOuterClass.cardboardModeRenderer;
                    }
                    case 222162766: {
                        return EndorsementMetadataSwapRendererOuterClass.endorsementMetadataSwapRenderer;
                    }
                    case 219522706: {
                        return InputGameTitleRendererOuterClass.inputGameTitleRenderer;
                    }
                    case 218434313: {
                        return MultiMessageConfirmDialogRendererOuterClass.multiMessageConfirmDialogRenderer;
                    }
                    case 218178449: {
                        return SlimVideoMetadataSectionRendererOuterClass.slimVideoInformationRenderer;
                    }
                    case 217875902: {
                        return SponsorshipsRenderers.sponsorshipsExpandableMessageRenderer;
                    }
                    case 217811633: {
                        return SlimVideoMetadataSectionRendererOuterClass.slimVideoActionBarRenderer;
                    }
                    case 217570036: {
                        return SlimVideoMetadataSectionRendererOuterClass.slimVideoDescriptionRenderer;
                    }
                    case 217298634: {
                        return SponsorshipsRenderers.sponsorshipsLoyaltyBadgeRenderer;
                    }
                    case 217298545: {
                        return SponsorshipsRenderers.sponsorshipsLoyaltyBadgesRenderer;
                    }
                    case 216237820: {
                        return FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementActionBarRenderer;
                    }
                    case 214714492: {
                        return StorageInfoRendererOuterClass.storageInfoRenderer;
                    }
                    case 214044107: {
                        return SuperStickerPackRendererOuterClass.superStickerPackBackstoryRenderer;
                    }
                    case 213527322: {
                        return FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementChannelRenderer;
                    }
                    case 213380311: {
                        return FeedFilterChipBarRendererOuterClass.feedFilterChipBarRenderer;
                    }
                    case 211734746: {
                        return ElementsAdCtaRendererOuterClass.elementsAdCtaRenderer;
                    }
                    case 210375385: {
                        return SponsorshipsRenderers.sponsorshipsAppBarRenderer;
                    }
                    case 207720144: {
                        return MiniplayerRendererOuterClass.miniplayerRenderer;
                    }
                    case 206077134: {
                        return MetadataRowContainerRendererOuterClass.richMetadataRenderer;
                    }
                    case 205542177: {
                        return CommentStickerRendererOuterClass.commentStickerRenderer;
                    }
                    case 203364271: {
                        return SponsorshipsRenderers.sponsorshipsListTileRenderer;
                    }
                    case 202680135: {
                        return AndroidPushNotificationRendererOuterClass$IconSurveyOptionRenderer.iconSurveyOptionRenderer;
                    }
                    case 202406340: {
                        return RecentlyUsedStickerPageRendererOuterClass.recentlyUsedStickerPageRenderer;
                    }
                    case 199981177: {
                        return SuperStickerPackRendererOuterClass.superStickerPackButtonRenderer;
                    }
                    case 199981082: {
                        return SuperStickerPackRendererOuterClass.superStickerPackRenderer;
                    }
                    case 199981058: {
                        return SuperStickerPackRendererOuterClass.superStickerPackItemButtonRenderer;
                    }
                    case 199215899: {
                        return IconTextBadgeRendererOuterClass.iconTextBadgeRenderer;
                    }
                    case 197858775: {
                        return SponsorshipsRenderers.sponsorshipsPerkRenderer;
                    }
                }
                break;
            }
        }
    }
    
    public final ahbf b(final MessageLite messageLite, final int n) {
        final String name = messageLite.getClass().getName();
        int n2 = 0;
        Label_0040: {
            if (name.hashCode() == 2999182) {
                if (name.equals("anuv")) {
                    n2 = 0;
                    break Label_0040;
                }
            }
            n2 = -1;
        }
        if (n2 != 0) {
            return d(messageLite, n);
        }
        switch (n) {
            default: {
                return d(messageLite, n);
            }
            case 197166996: {
                return SponsorshipsRenderers.sponsorshipsPerksRenderer;
            }
            case 197064214: {
                return LiveChatPaidStickerRendererOuterClass.liveChatPaidStickerRenderer;
            }
            case 196999352: {
                return UserMentionSuggestionRendererOuterClass.userMentionSuggestionRenderer;
            }
            case 196774331: {
                return BackstagePrefilledPostDialogHeaderRendererOuterClass.backstagePrefilledPostDialogHeaderFooterRenderer;
            }
            case 196567656: {
                return amsi.a;
            }
            case 196516197: {
                return RelatedChipContinuation.relatedChipsContinuationRenderer;
            }
            case 196501534: {
                return SponsorshipsRenderers.sponsorshipsTierRenderer;
            }
            case 196290093: {
                return ExpandableSurveyRenderer.ratingSurveyRenderer;
            }
            case 196186429: {
                return FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.fingerprintAuthRenderer;
            }
            case 196176225: {
                return PasswordAuthRendererOuterClass$PasswordAuthRenderer.passwordAuthRenderer;
            }
            case 196066171: {
                return UnicodeEmojiStickerPageRendererOuterClass.unicodeEmojiStickerPageRenderer;
            }
            case 195777387: {
                return SponsorshipsRenderers.sponsorshipsHeaderRenderer;
            }
            case 195330824: {
                return AndroidPushNotificationRendererOuterClass$NotificationSurveyCustomStyleRenderer.notificationSurveyCustomStyleRenderer;
            }
            case 195022506: {
                return AdThumbnailDetailsButtonRendererOuterClass.adThumbnailDetailsButtonRenderer;
            }
            case 194612962: {
                return PlayerMutedAutoplayOverlayRendererOuterClass.b;
            }
            case 193948706: {
                return FullscreenEngagementOverlayRendererOuterClass.fullscreenEngagementOverlayRenderer;
            }
            case 191824529: {
                return ExpandableSurveyRenderer.ratingSurveyOptionRenderer;
            }
            case 190730636: {
                return PlayerMutedAutoplayOverlayRendererOuterClass.a;
            }
            case 190700494: {
                return LiveChatMessageBuyFlowRendererOuterClass.liveChatMessageBuyFlowHeadingRenderer;
            }
            case 190696545: {
                return LiveChatItemRenderer.liveChatPaidMessageFooterRenderer;
            }
            case 190513794: {
                return SettingRenderer.settingDialogRenderer;
            }
            case 190379114: {
                return ajfn.a;
            }
            case 189943004: {
                return GamingAccountLinkConfirmDialogRendererOuterClass.gamingAccountLinkConfirmDialogRenderer;
            }
            case 189755427: {
                return GeoSearchDetailsRendererOuterClass.geoSearchDetailsRenderer;
            }
            case 189624769: {
                return LiveChatProductButtonRendererOuterClass.liveChatProductButtonRenderer;
            }
            case 189310070: {
                return BackstagePrefilledPostDialogHeaderRendererOuterClass.backstagePrefilledPostDialogHeaderRenderer;
            }
            case 188360221: {
                return RelatedChipCloudRendererOuterClass.relatedChipCloudRenderer;
            }
            case 187333422: {
                return SimpleSearchFilterGroupRendererOuterClass.simpleSearchFilterGroupRenderer;
            }
            case 187054494: {
                return MultiReelDismissalRendererOuterClass.multiReelDismissalRenderer;
            }
            case 186690709: {
                return StickerCatalogRendererOuterClass.dynamicStickerRenderer;
            }
            case 186676672: {
                return SlimVideoMetadataRendererOuterClass.slimMetadataAddToButtonRenderer;
            }
            case 185946010: {
                return UnpluggedPauseMembershipDialogRendererOuterClass.unpluggedPauseMembershipDialogRenderer;
            }
            case 182778558: {
                return PerksSectionRendererOuterClass.perkItemRenderer;
            }
            case 182759827: {
                return PerksSectionRendererOuterClass.sponsorsDescriptionRenderer;
            }
            case 182227031: {
                return FormfillPhoneNumberInputRendererOuterClass.formfillPhoneNumberInputRenderer;
            }
            case 182224395: {
                return CommandWrapperPromoRendererOuterClass.commandWrapperPromoRenderer;
            }
            case 182217997: {
                return FormfillTextInputRendererOuterClass.formfillTextInputRenderer;
            }
            case 182217985: {
                return FormfillInputRendererOuterClass.formfillInputRenderer;
            }
            case 180948322: {
                return aomn.a;
            }
            case 179869979: {
                return AndroidPushNotificationRendererOuterClass$BasicThumbnailCustomStyleRenderer.basicThumbnailCustomStyleRenderer;
            }
            case 178032415: {
                return SuggestedVideoRendererOuterClass.suggestedVideoRenderer;
            }
            case 177988428: {
                return SuggestedVideosHeaderRendererOuterClass.suggestedVideosHeaderRenderer;
            }
            case 177837979: {
                return CompactSuggestedVideoRendererOuterClass.compactSuggestedVideoRenderer;
            }
            case 175567564: {
                return FeedbackSurveyRendererOuterClass.feedbackOptionRenderer;
            }
            case 175530436: {
                return FeedbackSurveyRendererOuterClass.feedbackQuestionRenderer;
            }
            case 175253698: {
                return RedCarpetVideoRendererOuterClass.thumbnailBadgeIconRenderer;
            }
            case 174787167: {
                return RedCarpetVideoRendererOuterClass.overlayBadgeRenderer;
            }
            case 173545678: {
                return SponsorshipConfirmCancelRendererOuterClass.sponsorshipDialogHeaderRenderer;
            }
            case 171123157: {
                return FeedbackSurveyRendererOuterClass.feedbackSurveyRenderer;
            }
            case 168885433: {
                return ReelPickerButtonRendererOuterClass.reelPickerButtonRenderer;
            }
            case 168871383: {
                return ReelPickerItemRendererOuterClass.reelPickerItemRenderer;
            }
            case 168707113: {
                return AdClickCommandRendererOuterClass.adClickCommandRenderer;
            }
            case 168048356: {
                return BackstagePostDialogCreatorOnboardingPromoRendererOuterClass.backstagePostDialogCreatorOnboardingPromoRenderer;
            }
            case 166774965: {
                return ReelCreationMetadataRendererOuterClass.reelCreationMetadataRenderer;
            }
            case 166769652: {
                return CreationReelPickerRendererOuterClass.creationReelPickerRenderer;
            }
            case 166494362: {
                return MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.companionStateRenderer;
            }
            case 165633868: {
                return PrefilledFormCompanionExtensionRendererOuterClass.prefilledFormCompanionExtensionRenderer;
            }
            case 164529395: {
                return aoti.a;
            }
            case 164503419: {
                return SurveyTextInterstitialRendererOuterClass.surveyTextInterstitialRenderer;
            }
            case 164322822: {
                return StatusUpdateNotificationRendererOuterClass.statusUpdateNotificationRenderer;
            }
            case 164296548: {
                return SimpleAdBadgeRendererOuterClass.simpleAdBadgeRenderer;
            }
            case 163938213: {
                return StickerPageSelectorRendererOuterClass.stickerPageSelectorRenderer;
            }
            case 163938212: {
                return StickerPageRendererOuterClass.stickerPageRenderer;
            }
            case 163938211: {
                return StickerCatalogHeaderRendererOuterClass.stickerCatalogHeaderRenderer;
            }
            case 162200266: {
                return PerksSectionRendererOuterClass.perksSectionRenderer;
            }
            case 161499349: {
                return TvfilmOffersRendererOuterClass.offerGroupRenderer;
            }
            case 161499331: {
                return TvfilmOffersRendererOuterClass.couponRenderer;
            }
            case 160152806: {
                return PhonebookRenderer.phonebookBottomSheetMenuItemTemplateRenderer;
            }
            case 160152754: {
                return PhonebookRenderer.phonebookBottomSheetMenuTemplateRenderer;
            }
            case 158884182: {
                return ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer;
            }
            case 157534306: {
                return AdCtaButtonRendererOuterClass.adCtaButtonRenderer;
            }
            case 157256943: {
                return CompanionSponsoredButtonRendererOuterClass.sponsoredButtonRenderer;
            }
            case 157152260: {
                return MutedSparklesRendererOuterClass.mutedSparklesRenderer;
            }
            case 156617590: {
                return CollapsibleAdCtaRendererOuterClass.collapsibleAdCtaRenderer;
            }
            case 156440873: {
                return ReelVodLinkRendererOuterClass.reelVodLinkRenderer;
            }
            case 156330933: {
                return CommentSectionRendererOuterClass.backstageSubscribeBarRenderer;
            }
            case 156112846: {
                return MultiItemCompanionAdRendererOuterClass.multiItemCompanionAdRenderer;
            }
            case 155765234: {
                return GamingAccountLinkSettingRendererOuterClass.gamingAccountLinkSettingRenderer;
            }
            case 155431711: {
                return PlayerMutedAutoplayOverlayRendererOuterClass.playerMutedAutoplayOverlayRenderer;
            }
            case 154900756: {
                return ClarificationRendererOuterClass.clarificationRenderer;
            }
            case 154115041: {
                return TranscriptRendererOuterClass.transcriptRenderer;
            }
            case 153734792: {
                return ReelEditVideoRendererOuterClass.reelEditVideoRenderer;
            }
            case 153734791: {
                return ReelCameraRendererOuterClass.reelCameraRenderer;
            }
            case 153515154: {
                return ElementRendererOuterClass.elementRenderer;
            }
            case 153501068: {
                return ReelCreationTrayRendererOuterClass.reelCreationTrayRenderer;
            }
            case 153501067: {
                return StickerCatalogRendererOuterClass.stickerRenderer;
            }
            case 153408720: {
                return CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer;
            }
            case 153405107: {
                return CompactCompanionAdRendererOuterClass.compactCompanionAdRenderer;
            }
            case 152873793: {
                return TooltipRendererOuterClass.tooltipRenderer;
            }
            case 152345243: {
                return LocationEditRendererOuterClass.locationEditRenderer;
            }
            case 150927555: {
                return ajnj.b;
            }
            case 150814963: {
                return ajnj.c;
            }
            case 149559471: {
                return ajnj.a;
            }
            case 148775752: {
                return BrandInteractionRendererOuterClass.brandInteractionRenderer;
            }
            case 147100329: {
                return MobilePlaceResultRendererOuterClass.mobilePlaceResultRenderer;
            }
            case 146983445: {
                return MobileBroadcastSetupEventButtonRendererOuterClass.mobileBroadcastSetupEventButtonRenderer;
            }
            case 146979097: {
                return BroadcastStatusRendererOuterClass.broadcastStatusRenderer;
            }
            case 146961780: {
                return InputDateTimeRendererOuterClass.inputDateTimeRenderer;
            }
            case 146960413: {
                return MobileBroadcastSetupMoreOptionsRendererOuterClass.mobileBroadcastSetupMoreOptionsRenderer;
            }
            case 145440959: {
                return GhostCardRendererOuterClass.ghostCardRenderer;
            }
            case 144757704: {
                return CarouselItemRendererOuterClass.carouselItemRenderer;
            }
            case 141258672: {
                return amkh.a;
            }
            case 139970731: {
                return ReelPlayerOverlayRendererOuterClass.reelPlayerOverlayRenderer;
            }
            case 138681548: {
                return EngagementPanelTitleHeaderRendererOuterClass.engagementPanelTitleRenderer;
            }
            case 138681066: {
                return EngagementPanelSectionListRendererOuterClass.engagementPanelSectionListRenderer;
            }
            case 138592202: {
                return NativeAdBadgeRendererOuterClass.nativeAdBadgeRenderer;
            }
            case 133765738: {
                return AppPromoAdCtaRendererOuterClass.appPromoAdCtaRenderer;
            }
            case 133186183: {
                return anau.a;
            }
            case 132498670: {
                return LiveChatRestrictedParticipationRendererOuterClass.liveChatRestrictedParticipationRenderer;
            }
            case 130028801: {
                return LiveChatHeaderRendererOuterClass.liveChatHeaderRenderer;
            }
            case 128361622: {
                return MetadataBadgeRendererOuterClass.metadataBadgeRenderer;
            }
            case 127508420: {
                return ContentPillRendererOuterClass.contentPillRenderer;
            }
            case 126326492: {
                return EmojiPickerRendererOuterClass.emojiPickerRenderer;
            }
            case 124608045: {
                return SlimVideoMetadataRendererOuterClass.slimMetadataToggleButtonRenderer;
            }
            case 124608017: {
                return SlimVideoMetadataRendererOuterClass.slimMetadataButtonRenderer;
            }
            case 124003698: {
                return LiveErrorRendererOuterClass.liveErrorRenderer;
            }
            case 123905736: {
                return InputBooleanRendererOuterClass.inputBooleanRenderer;
            }
            case 123905687: {
                return InputSelectRendererOuterClass.inputSelectRenderer;
            }
            case 123808475: {
                return InputTextRendererOuterClass.inputTextRenderer;
            }
            case 122472668: {
                return RefinementChipRendererOuterClass.refinementChipRenderer;
            }
            case 122093513: {
                return StreamStatisticRendererOuterClass.streamStatisticRenderer;
            }
            case 121323709: {
                return alre.a;
            }
            case 120280839: {
                return RichListHeaderRendererOuterClass.richListHeaderRenderer;
            }
            case 120168182: {
                return VideoCardRendererOuterClass.videoCardRenderer;
            }
            case 119170535: {
                return SlimVideoMetadataRendererOuterClass.slimOwnerRenderer;
            }
            case 117777143: {
                return YpcUpgradeDialogRendererOuterClass.ypcUpgradeDialogRenderer;
            }
            case 117300536: {
                return LiveChatItemRenderer.liveChatTextMessageRenderer;
            }
            case 117294427: {
                return LiveChatRendererOuterClass.liveChatRenderer;
            }
            case 114255457: {
                return SurveyRenderer.checkboxSurveyOptionRenderer;
            }
            case 113780970: {
                return amcp.a;
            }
            case 106944603: {
                return AdPreviewRendererOuterClass.adPreviewRenderer;
            }
            case 106894322: {
                return SkipAdRendererOuterClass.skipButtonRenderer;
            }
            case 106887036: {
                return SkipAdRendererOuterClass.skipAdRenderer;
            }
            case 106875026: {
                return alfv.a;
            }
            case 104416691: {
                return BadgeRenderers.standaloneCollectionBadgeRenderer;
            }
            case 104364901: {
                return BadgeRenderers.standaloneRedBadgeRenderer;
            }
            case 102716411: {
                return HintRendererOuterClass.hintRenderer;
            }
            case 102114592: {
                return ThumbnailsRenderer.thumbnailLandscapePortraitRenderer;
            }
            case 99391126: {
                return PollRendererOuterClass.pollRenderer;
            }
            case 98817457: {
                return ajac.a;
            }
            case 96140188: {
                return NotificationActionRendererOuterClass.notificationActionRenderer;
            }
            case 95587818: {
                return ExpandButtonRendererOuterClass.expandButtonRenderer;
            }
            case 94317419: {
                return BackgroundPromoRendererOuterClass.backgroundPromoRenderer;
            }
            case 93764576: {
                return CommentShareboxRenderer.commentSimpleboxRenderer;
            }
            case 92670133: {
                return GamingSupportedRenderers.gameDetailsRenderer;
            }
            case 92155347: {
                return angv.a;
            }
            case 91394224: {
                return ChipCloudRendererOuterClass.chipCloudChipRenderer;
            }
            case 91394106: {
                return BadgeRenderers.standaloneYpcBadgeRenderer;
            }
            case 91227761: {
                return TextInputRendererOuterClass.textInputRenderer;
            }
            case 90823135: {
                return ChipCloudRendererOuterClass.chipCloudRenderer;
            }
            case 88571644: {
                return LugashFooterRendererOuterClass.lugashFooterRenderer;
            }
            case 88122887: {
                return UpsellDialogRendererOuterClass.upsellDialogRenderer;
            }
            case 85479539: {
                return alud.a;
            }
            case 85374086: {
                return FancyDismissibleDialogRendererOuterClass.fancyDismissibleDialogRenderer;
            }
            case 84996305: {
                return AutoplayRendererOuterClass.autoplayEndpointRenderer;
            }
            case 84469052: {
                return SurveyRenderer.surveyTriggerRenderer;
            }
            case 83537025: {
                return InlinePlaybackRendererOuterClass.inlinePlaybackRenderer;
            }
            case 79971800: {
                return ButtonRendererOuterClass.toggleButtonRenderer;
            }
            case 79129962: {
                return CompactLinkRendererOuterClass.compactLinkRenderer;
            }
            case 77195710: {
                return AccountsListRenderer.a;
            }
            case 76818770: {
                return SortFilterSubMenuRendererOuterClass.sortFilterSubMenuRenderer;
            }
            case 71102045: {
                return DropdownRendererOuterClass.dropdownRenderer;
            }
            case 66439850: {
                return MenuRendererOuterClass.menuRenderer;
            }
            case 65153809: {
                return ButtonRendererOuterClass.buttonRenderer;
            }
            case 65002523: {
                return AppPromoCompanionAdRendererOuterClass.appPromoCompanionAdRenderer;
            }
            case 64099105: {
                return ConfirmDialogRendererOuterClass.confirmDialogRenderer;
            }
            case 62381864: {
                return AccountsListRenderer.accountItemRenderer;
            }
            case 62285833: {
                return CommentSectionRendererOuterClass.commentThreadRenderer;
            }
            case 61331416: {
                return SettingRenderer.a;
            }
            case 61321220: {
                return SettingRenderer.settingSingleOptionMenuRenderer;
            }
            case 60572968: {
                return OfflineabilityRendererOuterClass.offlineabilityRenderer;
            }
            case 58508690: {
                return MessageRendererOuterClass.messageRenderer;
            }
            case 58356580: {
                return anex.a;
            }
            case 58121298: {
                return PlayerThreedRendererOuterClass.playerThreedRenderer;
            }
            case 58057493: {
                return AlertRendererOuterClass.alertRenderer;
            }
            case 57988071: {
                return apkc.a;
            }
            case 55514441: {
                return CompanionAdRendererOuterClass.companionAdRenderer;
            }
            case 55419609: {
                return SubscribeButtonRendererOuterClass.subscribeButtonRenderer;
            }
            case 54681060: {
                return ankp.a;
            }
            case 53330184: {
                return PlaylistVideoRendererOuterClass.playlistVideoRenderer;
            }
            case 51431404: {
                return HorizontalListRendererOuterClass.horizontalListRenderer;
            }
            case 50195462: {
                return ItemSectionRendererOuterClass.itemSectionRenderer;
            }
            case 49399797: {
                return SectionListRendererOuterClass.sectionListRenderer;
            }
            case 48602820: {
                return CompactListItemRendererOuterClass.compactListItemRenderer;
            }
            case 48479645: {
                return ChannelListSubMenuRendererOuterClass.channelListSubMenuRenderer;
            }
            case 46659098: {
                return AutoplayRendererOuterClass.a;
            }
        }
    }
}
