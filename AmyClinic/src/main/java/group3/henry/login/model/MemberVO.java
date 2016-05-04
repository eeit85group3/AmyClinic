package group3.henry.login.model;

import group3.carrie.app.model.AppVO;

import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.sql.*;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


//import javax.persistence.*;
//import org.hibernate.annotations.OrderBy;


// represents a single member
@SuppressWarnings("serial")
@Entity 
@Table(name = "Members")  
public class MemberVO implements Serializable {
	
	private Integer   mid;
	private String 	  name;
	private String 	  pwd;
	private String 	  email;
	private Date 	  birthday;
	private String	  country;
	private Character gender;
	private String	  addr;
	private String    phone;
	private Integer   height;
	private Integer   mass;
	private File	  photo;
	private String	  photoFileName;
	private String 	  photoContentType;
	private Integer	  act_status;
	private Integer   num_trans;
	private Integer   num_treatment;
	private Integer   num_visits;
	private Integer   total_spent;
	private Integer   reward_pts;
	private Date      last_visit;
	private String	  memo;
	private Date	  join_date;
	
	//One member -> Many appointments
	private Set<AppVO> appVO = new HashSet<AppVO>();

	
	public MemberVO() {
		super();
	}	

	public MemberVO(Integer mid, String name, String pwd, String email, Date birthday, String country,
					Character gender, String addr, String phone, Integer height, Integer mass,
					File photo, String photoFileName, String photoContentType, Integer act_status, Integer num_trans, Integer num_treatment,
					Integer num_visits, Integer total_spent, Integer reward_pts, Date last_visit,
					String memo, Date join_date) { //all info
		super();
		this.mid = mid;
		this.name = name;
		this.pwd = pwd;
		this.email = email;
		this.birthday = birthday;
		this.country = country;
		this.gender = gender;
		this.addr = addr;
		this.phone = phone;
		this.height = height;
		this.mass = mass;
		this.photo = photo;
		this.photoFileName = photoFileName;
		this.photoContentType = photoContentType;
		this.act_status = act_status;
		this.num_trans = num_trans;
		this.num_treatment = num_treatment;
		this.num_visits = num_visits;
		this.total_spent = total_spent;
		this.reward_pts = reward_pts;
		this.last_visit = last_visit;
		this.memo = memo;
		this.join_date = join_date;
	}
	
	public MemberVO(int mid, String name, String email, String pw) { // minimum required info
		super();
		this.mid = mid;
		this.name = name;
		this.email = email;
	}
	
	@Id  
	@SequenceGenerator(name="midGen", allocationSize=1) 
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator="midGen")       
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
		this.gender = gender;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getMass() {
		return mass;
	}
	public void setMass(Integer mass) {
		this.mass = mass;
	}
	public File getPhoto() {
		return photo;
	}
	public void setPhoto(File photo) {
		this.photo = photo;
	}
	public String getPhotoFileName() {
		return photoFileName;
	}
	public void setPhotoFileName(String photoFileName) {
		this.photoFileName = photoFileName;
	}
	public String getPhotoContentType() {
		return photoContentType;
	}
	public void setPhotoContentType(String photoContentType) {
		this.photoContentType = photoContentType;
	}

	@Column(name = "act_status", insertable=false)
	public Integer getAct_status() {
		return act_status;
	}
	public void setAct_status(Integer act_status) {
		this.act_status = act_status;
	}
	
	@Column(name = "num_trans", insertable=false)
	public Integer getNum_trans() {
		return num_trans;
	}
	public void setNum_trans(Integer num_trans) {
		this.num_trans = num_trans;
	}
	
	@Column(name = "num_treatment", insertable=false)
	public Integer getNum_treatment() {
		return num_treatment;
	}
	public void setNum_treatment(Integer num_treatment) {
		this.num_treatment = num_treatment;
	}
	
	@Column(name = "num_visits", insertable=false)
	public Integer getNum_visits() {
		return num_visits;
	}
	public void setNum_visits(Integer num_visits) {
		this.num_visits = num_visits;
	}
	
	@Column(name = "total_spent", insertable=false)
	public Integer getTotal_spent() {
		return total_spent;
	}
	public void setTotal_spent(Integer total_spent) {
		this.total_spent = total_spent;
	}
	
	@Column(name = "reward_pts", insertable=false)
	public Integer getReward_pts() {
		return reward_pts;
	}
	public void setReward_pts(Integer reward_pts) {
		this.reward_pts = reward_pts;
	}
	
	@Column(name = "last_visit", insertable=false)
	public Date getLast_visit() {
		return last_visit;
	}
	public void setLast_visit(Date last_visit) {
		this.last_visit = last_visit;
	}
	
	@Column(name = "memo", insertable=false)
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	@Column(name = "join_date", insertable=false)
	public Date getJoin_date() {
		return join_date;
	}
	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}
	
	//one member, many appointments
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "memberVO")
	@OrderBy("aid asc")
	public Set<AppVO> getAppVO() {
		return appVO;
	}
	public void setAppVO(Set<AppVO> appVO) {
		this.appVO = appVO;
	}

	// Reflection, gets properties of a class object. Testing method
	public void getProperties() throws IllegalArgumentException, IllegalAccessException {
		  Class<?> aClass = this.getClass();
		  Field[] declaredFields = aClass.getDeclaredFields();
		  Map<String, String> logEntries = new HashMap<>();

		  for (Field field : declaredFields) {
		    field.setAccessible(true);

		    Object[] arguments = new Object[]{
		      field.getName(),
		      field.getType().getSimpleName(),
		      String.valueOf(field.get(this))
		    };

		    String template = "- Property: {0} (Type: {1}, Value: {2})";
		    String logMessage = System.getProperty("line.separator")
		            + MessageFormat.format(template, arguments);

		    logEntries.put(field.getName(), logMessage);
		  }

		  SortedSet<String> sortedLog = new TreeSet<>(logEntries.keySet());

		  StringBuilder sb = new StringBuilder("Class properties:");

		  Iterator<String> it = sortedLog.iterator();
		  while (it.hasNext()) {
		    String key = it.next();
		    sb.append(logEntries.get(key));
		  }

		  System.out.println(sb.toString());
		}
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException{
		MemberVO vo = new MemberVO();
		vo.getProperties();
	}
}
