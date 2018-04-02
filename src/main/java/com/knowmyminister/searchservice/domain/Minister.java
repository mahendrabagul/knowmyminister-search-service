//package com.knowmyminister.searchservice.domain;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.elasticsearch.annotations.Document;
//import org.springframework.data.elasticsearch.annotations.Field;
//import org.springframework.data.elasticsearch.annotations.FieldType;
//
//import java.io.Serializable;
//import java.util.HashSet;
//import java.util.Objects;
//import java.util.Set;
//
///**
// * A Minister.
// */
//@Document(indexName = "knowmyminister",
//        type = "minister")
//public class Minister implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    private String id;
//
//    private String personalBackground;
//
//    private String familyBackground;
//
//    private String interests;
//
//    private String ideal;
//
//    private String motto;
//
//    @Field( type = FieldType.Nested)
//    private Image electionSign;
//
//    @Field( type = FieldType.Nested)
//    private PoliticalParty party;
//
//    private Bio bio;
//
//    private Set<Address> addresses = new HashSet<>();
//
//    private Set<Award> awards = new HashSet<>();
//
//    private Set<Photo> photos = new HashSet<>();
//
//    private Set<WorkExperience> workExperinces = new HashSet<>();
//
//    private Set<Education> educations = new HashSet<>();
//
//    private Set<SocialLink> socialLinks = new HashSet<>();
//
//    private PoliticalParty politicalParty;
//
//    public String getId()
//    {
//        return id;
//    }
//
//    public void setId(String id)
//    {
//        this.id = id;
//    }
//
//    public String getPersonalBackground()
//    {
//        return personalBackground;
//    }
//
//    public void setPersonalBackground(String personalBackground)
//    {
//        this.personalBackground = personalBackground;
//    }
//
//    public Minister personalBackground(String personalBackground)
//    {
//        this.personalBackground = personalBackground;
//        return this;
//    }
//
//    public String getFamilyBackground()
//    {
//        return familyBackground;
//    }
//
//    public void setFamilyBackground(String familyBackground)
//    {
//        this.familyBackground = familyBackground;
//    }
//
//    public Minister familyBackground(String familyBackground)
//    {
//        this.familyBackground = familyBackground;
//        return this;
//    }
//
//    public String getInterests()
//    {
//        return interests;
//    }
//
//    public void setInterests(String interests)
//    {
//        this.interests = interests;
//    }
//
//    public Minister interests(String interests)
//    {
//        this.interests = interests;
//        return this;
//    }
//
//    public String getIdeal()
//    {
//        return ideal;
//    }
//
//    public void setIdeal(String ideal)
//    {
//        this.ideal = ideal;
//    }
//
//    public Minister ideal(String ideal)
//    {
//        this.ideal = ideal;
//        return this;
//    }
//
//    public String getMotto()
//    {
//        return motto;
//    }
//
//    public void setMotto(String motto)
//    {
//        this.motto = motto;
//    }
//
//    public Minister motto(String motto)
//    {
//        this.motto = motto;
//        return this;
//    }
//
//    public Image getElectionSign()
//    {
//        return electionSign;
//    }
//
//    public void setElectionSign(Image image)
//    {
//        this.electionSign = image;
//    }
//
//    public Minister electionSign(Image image)
//    {
//        this.electionSign = image;
//        return this;
//    }
//
//    public PoliticalParty getParty()
//    {
//        return party;
//    }
//
//    public void setParty(PoliticalParty politicalParty)
//    {
//        this.party = politicalParty;
//    }
//
//    public Minister party(PoliticalParty politicalParty)
//    {
//        this.party = politicalParty;
//        return this;
//    }
//
//    public Bio getBio()
//    {
//        return bio;
//    }
//
//    public void setBio(Bio bio)
//    {
//        this.bio = bio;
//    }
//
//    public Minister bio(Bio bio)
//    {
//        this.bio = bio;
//        return this;
//    }
//
//    public Set<Address> getAddresses()
//    {
//        return addresses;
//    }
//
//    public void setAddresses(Set<Address> addresses)
//    {
//        this.addresses = addresses;
//    }
//
//    public Minister addresses(Set<Address> addresses)
//    {
//        this.addresses = addresses;
//        return this;
//    }
//
//    public Minister addAddress(Address address)
//    {
//        this.addresses.add(address);
//        address.setMinister(this);
//        return this;
//    }
//
//    public Minister removeAddress(Address address)
//    {
//        this.addresses.remove(address);
//        address.setMinister(null);
//        return this;
//    }
//
//    public Set<Award> getAwards()
//    {
//        return awards;
//    }
//
//    public void setAwards(Set<Award> awards)
//    {
//        this.awards = awards;
//    }
//
//    public Minister awards(Set<Award> awards)
//    {
//        this.awards = awards;
//        return this;
//    }
//
//    public Minister addAward(Award award)
//    {
//        this.awards.add(award);
//        award.setMinister(this);
//        return this;
//    }
//
//    public Minister removeAward(Award award)
//    {
//        this.awards.remove(award);
//        award.setMinister(null);
//        return this;
//    }
//
//    public Set<Photo> getPhotos()
//    {
//        return photos;
//    }
//
//    public void setPhotos(Set<Photo> photos)
//    {
//        this.photos = photos;
//    }
//
//    public Minister photos(Set<Photo> photos)
//    {
//        this.photos = photos;
//        return this;
//    }
//
//    public Minister addPhoto(Photo photo)
//    {
//        this.photos.add(photo);
//        photo.setMinister(this);
//        return this;
//    }
//
//    public Minister removePhoto(Photo photo)
//    {
//        this.photos.remove(photo);
//        photo.setMinister(null);
//        return this;
//    }
//
//    public Set<WorkExperience> getWorkExperinces()
//    {
//        return workExperinces;
//    }
//
//    public void setWorkExperinces(Set<WorkExperience> workExperiences)
//    {
//        this.workExperinces = workExperiences;
//    }
//
//    public Minister workExperinces(Set<WorkExperience> workExperiences)
//    {
//        this.workExperinces = workExperiences;
//        return this;
//    }
//
//    public Minister addWorkExperince(WorkExperience workExperience)
//    {
//        this.workExperinces.add(workExperience);
//        workExperience.setMinister(this);
//        return this;
//    }
//
//    public Minister removeWorkExperince(WorkExperience workExperience)
//    {
//        this.workExperinces.remove(workExperience);
//        workExperience.setMinister(null);
//        return this;
//    }
//
//    public Set<Education> getEducations()
//    {
//        return educations;
//    }
//
//    public void setEducations(Set<Education> educations)
//    {
//        this.educations = educations;
//    }
//
//    public Minister educations(Set<Education> educations)
//    {
//        this.educations = educations;
//        return this;
//    }
//
//    public Minister addEducation(Education education)
//    {
//        this.educations.add(education);
//        education.setMinister(this);
//        return this;
//    }
//
//    public Minister removeEducation(Education education)
//    {
//        this.educations.remove(education);
//        education.setMinister(null);
//        return this;
//    }
//
//    public Set<SocialLink> getSocialLinks()
//    {
//        return socialLinks;
//    }
//
//    public void setSocialLinks(Set<SocialLink> socialLinks)
//    {
//        this.socialLinks = socialLinks;
//    }
//
//    public Minister socialLinks(Set<SocialLink> socialLinks)
//    {
//        this.socialLinks = socialLinks;
//        return this;
//    }
//
//    public Minister addSocialLink(SocialLink socialLink)
//    {
//        this.socialLinks.add(socialLink);
//        socialLink.setMinister(this);
//        return this;
//    }
//
//    public Minister removeSocialLink(SocialLink socialLink)
//    {
//        this.socialLinks.remove(socialLink);
//        socialLink.setMinister(null);
//        return this;
//    }
//
//    public PoliticalParty getPoliticalParty()
//    {
//        return politicalParty;
//    }
//
//    public void setPoliticalParty(PoliticalParty politicalParty)
//    {
//        this.politicalParty = politicalParty;
//    }
//
//    public Minister politicalParty(PoliticalParty politicalParty)
//    {
//        this.politicalParty = politicalParty;
//        return this;
//    }
//
//    @Override
//    public boolean equals(Object o)
//    {
//        if (this == o)
//        {
//            return true;
//        }
//        if (o == null || getClass() != o.getClass())
//        {
//            return false;
//        }
//        Minister minister = (Minister) o;
//        if (minister.getId() == null || getId() == null)
//        {
//            return false;
//        }
//        return Objects.equals(getId(), minister.getId());
//    }
//
//    @Override
//    public int hashCode()
//    {
//        return Objects.hashCode(getId());
//    }
//
//}
